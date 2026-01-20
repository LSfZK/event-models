package lsfzk.events;

public record PromoteResponseEvent(
        Long userId,
        Long requestId,
        Long adminId,
        boolean approved
) { }
