package net.dzikoysk.funnyguilds.rank;

import com.google.common.collect.Iterables;
import net.dzikoysk.funnyguilds.FunnyGuilds;
import net.dzikoysk.funnyguilds.guild.Guild;
import net.dzikoysk.funnyguilds.guild.GuildRank;
import net.dzikoysk.funnyguilds.shared.bukkit.PermissionUtils;
import net.dzikoysk.funnyguilds.user.User;
import net.dzikoysk.funnyguilds.user.UserRank;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class RankManager {

    private static RankManager INSTANCE;

    protected NavigableSet<UserRank> usersRank = new TreeSet<>(Collections.reverseOrder());
    protected NavigableSet<GuildRank> guildsRank = new TreeSet<>(Collections.reverseOrder());

    public RankManager() {
        INSTANCE = this;
    }

    public static RankManager getInstance() {
        return INSTANCE;
    }

    public void update(User user) {
        if (user.getUUID().version() == 2) {
            return;
        }

        if (FunnyGuilds.getInstance().getPluginConfiguration().skipPrivilegedPlayersInRankPositions &&
                PermissionUtils.isPrivileged(user, "funnyguilds.ranking.exempt")) {
            return;
        }

        this.usersRank.add(user.getRank());
    }

    public void update(Guild guild) {
        if (!guild.isRanked()) {
            return;
        }

        this.guildsRank.add(guild.getRank());
    }

    public User getUser(int i) {
        if (i - 1 < this.usersRank.size()) {
            return Iterables.get(this.usersRank, i - 1).getUser();
        }

        return null;
    }

    public Guild getGuild(int i) {
        if (i - 1 < this.guildsRank.size()) {
            return Iterables.get(this.guildsRank, i - 1).getGuild();
        }

        return null;
    }

    public int users() {
        return this.usersRank.size();
    }

    public int guilds() {
        return this.guildsRank.size();
    }

}