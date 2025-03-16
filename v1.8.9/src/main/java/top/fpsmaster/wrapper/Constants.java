package top.fpsmaster.wrapper;

import org.jetbrains.annotations.NotNull;
import top.fpsmaster.interfaces.client.IConstantsWrapper;

public class Constants implements IConstantsWrapper {
    public static final String VERSION = "1.8.9";
    public static final String EDITION = "Forge";

    @NotNull
    @Override
    public String getVersion() {
        return VERSION;
    }

    @NotNull
    @Override
    public String getEdition() {
        return EDITION;
    }
}
