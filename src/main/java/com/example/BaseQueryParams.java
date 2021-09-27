package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.micronaut.core.annotation.Introspected;
import org.immutables.value.Value;

import java.util.Optional;

import static org.immutables.value.Value.Style.ImplementationVisibility.PUBLIC;

@Introspected
@Value.Immutable
@Value.Style(visibility = PUBLIC)
@JsonDeserialize(builder = ImmutableBaseQueryParams.Builder.class)
public interface BaseQueryParams {

    @JsonProperty("demote-oos")
    Optional<Boolean> getDemoteOos();

    @JsonProperty("demote_oos_test")
    Optional<Boolean> getDemoteOosTest();
}
