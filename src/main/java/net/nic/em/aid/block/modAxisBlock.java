package net.nic.em.aid.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.minecraftforge.common.ToolActions.AXE_STRIP;



public class modAxisBlock extends RotatedPillarBlock {
    private final BlockState stripped;
    public modAxisBlock(Properties properties, BlockState StrippedState) {
        super(properties);
        stripped = StrippedState;
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, @NotNull UseOnContext context, ToolAction toolAction, boolean simulate) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        boolean safeCheck;
        if (stripped != null) { safeCheck = stripped.getBlock() instanceof RotatedPillarBlock; } else { safeCheck = false; }
        if (AXE_STRIP == toolAction && context.getItemInHand().canPerformAction(AXE_STRIP) && safeCheck) {
            Direction.Axis axis = world.getBlockState(blockPos).getValue(AXIS);
            return stripped.setValue(AXIS, axis);
        } else { return null; }
    }


}
