package org.flcode.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactInfo {
    private String email;
    private String phoneNumber;
    private String mobileNumber;
    private String alternativePhone;
    private boolean emailVerified;
    private boolean phoneVerified;
}
