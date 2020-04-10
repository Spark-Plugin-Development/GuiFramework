package dev.esophose.guiframework.gui;

import dev.esophose.guiframework.gui.screen.GuiScreen;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface GuiContainer extends Tickable {

    @NotNull
    GuiContainer setPersistent(boolean persistent);

    @NotNull
    GuiContainer setTickRate(int tickRate);

    @NotNull
    GuiContainer addScreen(@NotNull GuiScreen screen);

    void openFor(@NotNull Player player);

    void openFor(@NotNull Player player, int screenNumber);

    @NotNull
    Map<Integer, GuiScreen> getNumberedScreens();

    @NotNull
    Collection<GuiScreen> getScreens();

    boolean isPersistent();

    int getTickRate();

    @NotNull
    Map<UUID, GuiView> getCurrentViewers();

    int getTotalViewers();

    boolean hasViewers();

    void closeViewers();

}
