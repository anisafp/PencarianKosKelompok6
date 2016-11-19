package id.sch.smktelkom_mlg.project.xiirpl406162636.pencariankoskelompok6.model;

import java.io.Serializable;

/**
 * Created by anis ayu on 11/5/2016.
 */

public class Hotel implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Hotel(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
