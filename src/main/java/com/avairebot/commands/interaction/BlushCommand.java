/*
 * Copyright (c) 2019.
 *
 * This file is part of AvaIre.
 *
 * AvaIre is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AvaIre is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AvaIre.  If not, see <https://www.gnu.org/licenses/>.
 *
 *
 */

package com.avairebot.commands.interaction;

import com.avairebot.AvaIre;
import com.avairebot.contracts.commands.InteractionCommand;

import java.util.Arrays;
import java.util.List;

public class BlushCommand extends InteractionCommand {

    public BlushCommand(AvaIre avaire) {
        super(avaire);
    }

    @Override
    public List<String> getInteractionImages() {
        return Arrays.asList(
            "https://i.imgur.com/m5q2jwP.gif",
            "https://i.imgur.com/8XzsQ8v.gif",
            "https://i.imgur.com/iCWneqB.gif",
            "https://i.imgur.com/etHFA8z.gif",
            "https://i.imgur.com/5Hs93Q7.gif",
            "https://i.imgur.com/gd37yvr.gif",
            "https://i.imgur.com/vQ7rLby.gif",
            "https://i.imgur.com/nOMfuBW.gif",
            "https://i.imgur.com/WuCrlrz.gif",
            "https://i.imgur.com/4CqtSTx.gif",
            "https://i.imgur.com/9vKwAmw.gif",
            "https://i.imgur.com/ntCVuN7.gif",
            "https://i.imgur.com/zvxsyl1.gif",
            "https://i.imgur.com/XcoVx96.gif",
            "https://i.imgur.com/QHXFXIS.gif",
            "https://i.imgur.com/mFc0bnR.gif",
            "https://i.imgur.com/kSL8tNp.gif"
        );
    }

    @Override
    public String getName() {
        return "Blush Command";
    }

    @Override
    public List<String> getTriggers() {
        return Arrays.asList("blush", "blushes");
    }
}
