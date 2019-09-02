/*
 * Copyright (c) 2018.
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

public class HugCommand extends InteractionCommand {

    public HugCommand(AvaIre avaire) {
        super(avaire);
    }

    @Override
    public List<String> getInteractionImages() {
        return Arrays.asList(
            "https://i.imgur.com/aBdIEEu.gif",
            "https://i.imgur.com/03grRGj.gif",
            "https://i.imgur.com/EuIBiLi.gif",
            "https://i.imgur.com/8KgVR9j.gif",
            "https://i.imgur.com/ZepPo0t.gif",
            "https://i.imgur.com/iIsFQ3q.gif",
            "https://i.imgur.com/XHhFoR1.gif",
            "https://i.imgur.com/psGdps5.gif",
            "https://i.imgur.com/OPKBDeA.gif",
            "https://i.imgur.com/D0GABc2.gif",
            "https://i.imgur.com/LtVBCX3.gif",
            "https://i.imgur.com/o8JQtVL.gif",
            "https://i.imgur.com/uRA2axr.gif",
            "https://i.imgur.com/1FkuC6E.gif",
            "https://i.imgur.com/cj81Ipw.gif",
            "https://i.imgur.com/diq0jxy.gif",
            "https://i.imgur.com/4qs0LWU.gif",
            "https://i.imgur.com/KdD46IR.gif",
            "https://i.imgur.com/qlLcA1A.gif",
            "https://i.imgur.com/aqqtSq5.gif",
            "https://i.imgur.com/9YvVODC.gif",
            "https://i.imgur.com/1E6VCD1.gif",
            "https://i.imgur.com/aQaM4ur.gif",
            "https://i.imgur.com/21GYXTb.gif",
            "https://i.imgur.com/dvrc7MU.gif"
        );
    }

    @Override
    public String getName() {
        return "Hug Command";
    }

    @Override
    public List<String> getTriggers() {
        return Arrays.asList("hug", "hugs");
    }
}
