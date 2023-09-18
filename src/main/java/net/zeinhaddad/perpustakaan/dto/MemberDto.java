package net.zeinhaddad.perpustakaan.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MemberDto {
    private Long id;

    @NotEmpty(message = "ID member tidak boleh kosong")
    private String memberID;

    @NotEmpty(message = "Nama tidak boleh kosong")
    private String name;

    @NotEmpty(message = "Alamat tidak boleh kosong")
    private String address;

    @NotEmpty(message = "Nomor telepon tidak boleh kosong")
    private String phoneNumber;
}
