package common.recipeLoaders;

import static gregtech.api.util.GT_Recipe.GT_Recipe_Map.sAssemblerRecipes;
import static gregtech.api.util.GT_RecipeBuilder.MINUTES;
import static gregtech.api.util.GT_RecipeBuilder.SECONDS;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;

import common.Blocks;
import common.TileEntities;
import common.items.ErrorItem;
import common.items.MetaItem_CraftingComponent;

import gregtech.api.enums.*;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import kekztech.Items;

public class Assembler implements Runnable {

    @Override
    public void run() {
        // TFFT Casing

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.getIntegratedCircuit(6),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.StainlessSteel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.DarkSteel, 3),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.EnderPearl, 3))
                .itemOutputs(new ItemStack(Blocks.tfftStorageField, 1))
                .fluidInputs(Materials.Polytetrafluoroethylene.getMolten(144)).noFluidOutputs().duration(5 * SECONDS)
                .eut(TierEU.RECIPE_HV).addTo(sAssemblerRecipes);
        // TFFT Multi Hatch

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        ItemList.Hull_HV.get(1),
                        ItemList.Cover_FluidStorageMonitor.get(1),
                        ItemList.Field_Generator_LV.get(4),
                        GT_OreDictUnificator.get(OrePrefixes.pipeTiny, Materials.Polytetrafluoroethylene, 25))
                .itemOutputs(TileEntities.tfftHatch.getStackForm(1)).fluidInputs(Materials.Plastic.getMolten(432))
                .noFluidOutputs().duration(20 * SECONDS).eut(TierEU.RECIPE_HV).addTo(sAssemblerRecipes);
        // TFFTStorageField1

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.getIntegratedCircuit(6),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.CrudeSteel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.CrudeSteel, 6),
                        GT_OreDictUnificator.get(OrePrefixes.pipeNonuple, Materials.Steel, 3),
                        ItemList.FluidRegulator_LV.get(1))
                .itemOutputs(new ItemStack(Blocks.tfftStorageField, 1, 1)).fluidInputs(Materials.Glass.getMolten(144))
                .noFluidOutputs().duration(5 * SECONDS).eut(TierEU.RECIPE_HV).addTo(sAssemblerRecipes);
        // TFFTStorageField2

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.getIntegratedCircuit(6),
                        ItemList.Casing_Tank_1.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.EnergeticSilver, 6),
                        GT_OreDictUnificator.get(OrePrefixes.pipeNonuple, Materials.Plastic, 3),
                        ItemList.FluidRegulator_MV.get(1))
                .itemOutputs(new ItemStack(Blocks.tfftStorageField, 1, 2)).fluidInputs(Materials.Plastic.getMolten(288))
                .noFluidOutputs().duration(10 * SECONDS).eut(TierEU.RECIPE_HV).addTo(sAssemblerRecipes);
        // TFFTStorageField3

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.getIntegratedCircuit(6),
                        ItemList.Casing_Tank_3.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.VividAlloy, 6),
                        GT_OreDictUnificator.get(OrePrefixes.pipeNonuple, Materials.StainlessSteel, 3),
                        ItemList.Field_Generator_LV.get(1),
                        ItemList.FluidRegulator_HV.get(1))
                .itemOutputs(new ItemStack(Blocks.tfftStorageField, 1, 3)).fluidInputs(Materials.Plastic.getMolten(432))
                .noFluidOutputs().duration(20 * SECONDS).eut(TierEU.RECIPE_HV).addTo(sAssemblerRecipes);
        // TFFTStorageField4

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.getIntegratedCircuit(6),
                        ItemList.Casing_Tank_5.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Enderium, 6),
                        GT_OreDictUnificator.get(OrePrefixes.pipeNonuple, Materials.Polytetrafluoroethylene, 3),
                        ItemList.Field_Generator_MV.get(2),
                        ItemList.FluidRegulator_EV.get(1))
                .itemOutputs(new ItemStack(Blocks.tfftStorageField, 1, 4)).fluidInputs(Materials.Epoxid.getMolten(864))
                .noFluidOutputs().duration(20 * SECONDS).eut(TierEU.RECIPE_EV).addTo(sAssemblerRecipes);
        // TFFTStorageField5

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.getIntegratedCircuit(6),
                        ItemList.Casing_Tank_7.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.CrystallineAlloy, 6),
                        GT_OreDictUnificator.get(OrePrefixes.pipeNonuple, Materials.Enderium, 3),
                        ItemList.Field_Generator_HV.get(4),
                        ItemList.FluidRegulator_IV.get(1))
                .itemOutputs(new ItemStack(Blocks.tfftStorageField, 1, 5)).fluidInputs(Materials.Epoxid.getMolten(1152))
                .noFluidOutputs().duration(20 * SECONDS).eut(TierEU.RECIPE_IV).addTo(sAssemblerRecipes);
        // LSC Casing

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Tantalum, 4),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.TungstenSteel, 2),
                        GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.TungstenSteel, 2),
                        GT_OreDictUnificator.get(OrePrefixes.block, Materials.Lapis, 1))
                .itemOutputs(new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 0)).noFluidInputs().noFluidOutputs()
                .duration(5 * SECONDS).eut(TierEU.RECIPE_HV).addTo(sAssemblerRecipes);
        // EV Capacitor alt recipe

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 6),
                        GT_ModHandler.getIC2Item("lapotronCrystal", 1L, GT_Values.W),
                        GT_Utility.getIntegratedCircuit(7))
                .itemOutputs(new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 7)).noFluidInputs().noFluidOutputs()
                .duration(10 * SECONDS).eut(TierEU.RECIPE_HV).addTo(sAssemblerRecipes);
        // IV Capacitor alt recipe

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 6),
                        ItemList.Energy_LapotronicOrb.get(1L),
                        GT_Utility.getIntegratedCircuit(1))
                .itemOutputs(new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 1)).noFluidInputs().noFluidOutputs()
                .duration(20 * SECONDS).eut(TierEU.RECIPE_EV).addTo(sAssemblerRecipes);
        // LuV Capacitor alt recipe

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        ItemList.Energy_LapotronicOrb2.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Osmiridium, 4),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Osmiridium, 24),
                        GT_Utility.getIntegratedCircuit(6))
                .itemOutputs(new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 2)).noFluidInputs().noFluidOutputs()
                .duration(40 * SECONDS).eut(TierEU.RECIPE_IV).addTo(sAssemblerRecipes);
        // ZPM Capacitor alt recipe

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        ItemList.Energy_Module.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.NaquadahAlloy, 4),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.NaquadahAlloy, 24),
                        GT_Utility.getIntegratedCircuit(6))
                .itemOutputs(new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 3)).noFluidInputs().noFluidOutputs()
                .duration(1 * MINUTES + 20 * SECONDS).eut(TierEU.RECIPE_LuV).addTo(sAssemblerRecipes);
        // UV Capacitor alt recipe

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        ItemList.Energy_Cluster.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Neutronium, 4),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Neutronium, 24),
                        GT_Utility.getIntegratedCircuit(6))
                .itemOutputs(new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 4)).noFluidInputs().noFluidOutputs()
                .duration(2 * MINUTES + 40 * SECONDS).eut(TierEU.RECIPE_ZPM).addTo(sAssemblerRecipes);
        // UHV Capacitor alt recipe

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        ItemList.ZPM3.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.CosmicNeutronium, 4),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.CosmicNeutronium, 24),
                        GT_Utility.getIntegratedCircuit(6))
                .itemOutputs(new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 5)).noFluidInputs().noFluidOutputs()
                .duration(5 * MINUTES + 20 * SECONDS).eut(TierEU.RECIPE_UV).addTo(sAssemblerRecipes);
        // UEV Capacitor alt recipe

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        ItemList.ZPM4.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Infinity, 4),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Infinity, 24),
                        GT_Utility.getIntegratedCircuit(6))
                .itemOutputs(new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 8)).noFluidInputs().noFluidOutputs()
                .duration(10 * MINUTES + 40 * SECONDS).eut(TierEU.RECIPE_UHV).addTo(sAssemblerRecipes);
        // UIV Capacitor alt recipe

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        ItemList.ZPM5.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, MaterialsUEVplus.TranscendentMetal, 4),
                        GT_OreDictUnificator.get(OrePrefixes.screw, MaterialsUEVplus.TranscendentMetal, 24),
                        GT_Utility.getIntegratedCircuit(6))
                .itemOutputs(new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 9)).noFluidInputs().noFluidOutputs()
                .duration(10 * MINUTES + 40 * SECONDS).eut(TierEU.RECIPE_UEV).addTo(sAssemblerRecipes);
        // UMV Capacitor alt recipe

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        ItemList.ZPM6.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, MaterialsUEVplus.SpaceTime, 4),
                        GT_OreDictUnificator.get(OrePrefixes.screw, MaterialsUEVplus.SpaceTime, 24),
                        GT_Utility.getIntegratedCircuit(6))
                .itemOutputs(new ItemStack(Blocks.lscLapotronicEnergyUnit, 1, 10)).noFluidInputs().noFluidOutputs()
                .duration(10 * MINUTES + 40 * SECONDS).eut(TierEU.RECIPE_UIV).addTo(sAssemblerRecipes);

        final MetaItem_CraftingComponent craftingItem = MetaItem_CraftingComponent.getInstance();

        // YSZ Unit

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.getIntegratedCircuit(6),
                        craftingItem.getStackOfAmountFromDamage(Items.YSZCeramicPlate.getMetaID(), 4),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Yttrium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.StainlessSteel, 1),
                        ItemList.Electric_Motor_HV.get(1L))
                .itemOutputs(new ItemStack(Blocks.yszUnit, 1)).fluidInputs(Materials.Hydrogen.getGas(4000))
                .noFluidOutputs().duration(60 * SECONDS).eut(TierEU.RECIPE_HV).addTo(sAssemblerRecipes);
        // GDC Unit

        GT_Values.RA.stdBuilder().itemInputs(
                GT_Utility.getIntegratedCircuit(6),
                craftingItem.getStackOfAmountFromDamage(Items.GDCCeramicPlate.getMetaID(), 8),
                GT_OreDictUnificator
                        .get(OrePrefixes.frameGt, Materials.Gadolinium, new ItemStack(ErrorItem.getInstance(), 1), 1),
                GT_OreDictUnificator
                        .get(OrePrefixes.rotor, Materials.Desh, new ItemStack(ErrorItem.getInstance(), 1), 1),
                ItemList.Electric_Motor_IV.get(1L)).itemOutputs(new ItemStack(Blocks.gdcUnit, 1))
                .fluidInputs(Materials.Hydrogen.getGas(16000)).noFluidOutputs().duration(2 * MINUTES)
                .eut(TierEU.RECIPE_EV).addTo(sAssemblerRecipes);
        // Hex Tiles

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.getIntegratedCircuit(6),
                        GT_OreDictUnificator.get(OrePrefixes.stone, Materials.Concrete, 1),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Steel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.foil, Materials.DarkSteel, 2))
                .itemOutputs(new ItemStack(Blocks.largeHexPlate, 2))
                .fluidInputs(FluidRegistry.getFluidStack("molten.plastic", 36)).noFluidOutputs().duration(30 * SECONDS)
                .eut(TierEU.RECIPE_MV).addTo(sAssemblerRecipes);

    }
}
