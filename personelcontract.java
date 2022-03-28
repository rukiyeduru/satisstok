
package enties;

public class personelcontract {
    private int id;
    private String adiSoyadi;
    private String email;
    private int yetkiId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYetkiId() {
        return yetkiId;
    }

    public void setYetki(int yetkiId) {
        this.yetkiId = yetkiId;
    }

public String toSting(){
return id + "" + adiSoyadi + "" + email+ ""+yetkiId+ "";
        }

}
