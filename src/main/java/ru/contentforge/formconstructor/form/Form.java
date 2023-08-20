package ru.contentforge.formconstructor.form;

import cn.nukkit.player.Player;
import cn.nukkit.form.window.FormWindow;
import lombok.Getter;
import ru.contentforge.formconstructor.event.PlayerFormSendEvent;

abstract public class Form extends FormWindow {

    @Getter protected transient boolean async = false;

    public void send(Player player) {
        this.send(player, false);
    }

    public void send(Player player, boolean async) {
        PlayerFormSendEvent event = new PlayerFormSendEvent(player, this, async);
        event.call();

        if (!event.isCancelled()) {
            this.async = async;
            player.showFormWindow(this);
        }
    }

    public void sendAsync(Player player) {
        this.send(player, true);
    }

}
