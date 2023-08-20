package ru.contentforge.formconstructor.form.handler;

import cn.nukkit.player.Player;

public interface ModalFormHandler extends FormHandler {

    void handle(Player player, boolean data);

}
