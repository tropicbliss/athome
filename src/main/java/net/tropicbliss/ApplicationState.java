package net.tropicbliss;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.inject.Singleton;

@Singleton
@Serdeable
public class ApplicationState {
    private boolean isHome = true;

    @NonNull
    public boolean getIsHome() {
        return isHome;
    }

    public void setIsHome(boolean isHome) {
        this.isHome = isHome;
    }
}
