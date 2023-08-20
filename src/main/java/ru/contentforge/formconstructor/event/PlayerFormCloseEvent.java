package ru.contentforge.formconstructor.event;

import cn.nukkit.player.Player;
import cn.nukkit.event.player.PlayerEvent;
import ru.contentforge.formconstructor.form.Form;
import cn.nukkit.event.HandlerList;
import lombok.RequiredArgsConstructor;
import lombok.Getter;

@Getter
@RequiredArgsConstructor
public class PlayerFormCloseEvent extends PlayerEvent {
 
    private final Player player;
    private final Form form;

}
