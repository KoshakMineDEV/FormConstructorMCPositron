package ru.contentforge.formconstructor.form.handler;

import cn.nukkit.player.Player;
import ru.contentforge.formconstructor.form.element.Button;

public interface SimpleFormHandler extends FormHandler {

    void handle(Player player, Button button);

}
