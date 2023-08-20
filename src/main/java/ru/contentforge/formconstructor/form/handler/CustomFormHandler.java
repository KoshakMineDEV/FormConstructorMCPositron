package ru.contentforge.formconstructor.form.handler;

import cn.nukkit.player.Player;
import ru.contentforge.formconstructor.form.response.CustomFormResponse;

public interface CustomFormHandler extends FormHandler {

    void handle(Player player, CustomFormResponse response);

}
