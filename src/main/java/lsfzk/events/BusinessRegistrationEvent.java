package lsfzk.events;

public record BusinessRegistrationEvent(
        Long userId,
        Long registrationId,
        String userNickname,
        String businessName,
        String businessNumber, // Tax ID
        String ownerPhoneNumber
) {}
