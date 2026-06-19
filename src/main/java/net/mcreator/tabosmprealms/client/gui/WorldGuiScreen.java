package net.mcreator.tabosmprealms.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.tabosmprealms.world.inventory.WorldGuiMenu;
import net.mcreator.tabosmprealms.network.WorldGuiButtonMessage;
import net.mcreator.tabosmprealms.TabosmprealmsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WorldGuiScreen extends AbstractContainerScreen<WorldGuiMenu> {
	private final static HashMap<String, Object> guistate = WorldGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_ressources_world_button;
	ImageButton imagebutton_nether_button;
	ImageButton imagebutton_build_world_button;

	public WorldGuiScreen(WorldGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tabosmprealms:textures/screens/world_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.tabosmprealms.world_gui.label_changer_de_monde"), 45, 10, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_ressources_world_button = new ImageButton(this.leftPos + 21, this.topPos + 41, 34, 34, 0, 0, 34, new ResourceLocation("tabosmprealms:textures/screens/atlas/imagebutton_ressources_world_button.png"), 34, 68, e -> {
			if (true) {
				TabosmprealmsMod.PACKET_HANDLER.sendToServer(new WorldGuiButtonMessage(0, x, y, z));
				WorldGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ressources_world_button", imagebutton_ressources_world_button);
		this.addRenderableWidget(imagebutton_ressources_world_button);
		imagebutton_nether_button = new ImageButton(this.leftPos + 110, this.topPos + 41, 34, 34, 0, 0, 34, new ResourceLocation("tabosmprealms:textures/screens/atlas/imagebutton_nether_button.png"), 34, 68, e -> {
			if (true) {
				TabosmprealmsMod.PACKET_HANDLER.sendToServer(new WorldGuiButtonMessage(1, x, y, z));
				WorldGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_nether_button", imagebutton_nether_button);
		this.addRenderableWidget(imagebutton_nether_button);
		imagebutton_build_world_button = new ImageButton(this.leftPos + 69, this.topPos + 104, 34, 34, 0, 0, 34, new ResourceLocation("tabosmprealms:textures/screens/atlas/imagebutton_build_world_button.png"), 34, 68, e -> {
			if (true) {
				TabosmprealmsMod.PACKET_HANDLER.sendToServer(new WorldGuiButtonMessage(2, x, y, z));
				WorldGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_build_world_button", imagebutton_build_world_button);
		this.addRenderableWidget(imagebutton_build_world_button);
	}
}
