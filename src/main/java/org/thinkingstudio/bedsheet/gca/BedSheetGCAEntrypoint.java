package org.thinkingstudio.bedsheet.gca;

import dev.dubhe.gugle.carpet.GcaExtension;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.thinkingstudio.bedsheet.loader.entrypoint.ModInitializer;

@Mod(BedSheetGCAEntrypoint.MODID)
public class BedSheetGCAEntrypoint {
    public static final String MODID = "bedsheet_gca";

    public BedSheetGCAEntrypoint(ModContainer modContainer) {
        modContainer.registerExtensionPoint(ModInitializer.class, new GcaExtension());
    }
}
