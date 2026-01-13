package lsfzk.events;

public record PromoteRequestEvent(
        Long userId,
        Long requestId,
        String newRole
) { }
