package github.kasuminova.novaeng.common.container.slot;

import github.kasuminova.novaeng.common.hypernet.proc.server.module.ModuleRegistry;
import github.kasuminova.novaeng.common.hypernet.proc.server.module.base.ModuleCopperPipeBase;
import github.kasuminova.novaeng.common.util.ServerModuleInv;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class SlotCopperPipeItemHandler extends SlotConditionItemHandler {

    public SlotCopperPipeItemHandler(final int index, final ServerModuleInv inventoryIn) {
        super(inventoryIn, index, -1, 0, 0);
    }

    @Override
    public String getSlotDescription() {
        return "";
    }

    @Override
    public boolean isItemValid(@Nonnull final ItemStack stack) {
        return ModuleRegistry.getModule(stack) instanceof ModuleCopperPipeBase;
    }
}