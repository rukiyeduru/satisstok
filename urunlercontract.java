
package enties;

import java.util.Date;


public class urunlercontract {
    private int id ;
    private String adi;
    private int kategoriId;
    private Date tarih;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
     
    @Override
    public String toString(){
        return id + "" + adi +""+ kategoriId +""+tarih +"" ;
    }
}
