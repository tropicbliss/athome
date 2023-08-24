package net.tropicbliss;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

@Secured(SecurityRule.IS_AUTHENTICATED)
@Controller
public class MainController {
    private final ApplicationState applicationState;

    public MainController(@Nullable ApplicationState applicationState) {
        this.applicationState = applicationState;
    }

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public ApplicationState getAtHome() {
        return applicationState;
    }

    @Post
    public void setAtHome(@Body ApplicationState state) {
        applicationState.setIsHome(state.getIsHome());
    }
}
