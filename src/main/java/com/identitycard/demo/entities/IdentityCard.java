package com.identitycard.demo.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "identity_card", schema = "IdentityCard", catalog = "")
public class IdentityCard {
    private int id;
    private String ad;
    private String soyad;
    private String ataAdi;
    private String doqulduquYer;
    private Date doqulduquTarix;
    private int seriya;
    private String aileVezyeti;
    private String herbiVezife;
    private String qanQrup;
    private String gozRengi;
    private String cinsi;
    private String yasayisYeri;
    private int boyu;
    private String vesiqeniVerenOrqan;
    private Date vesqieninVerilmeTarixi;
    private Date etibarlidir;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ad")
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Basic
    @Column(name = "soyad")
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Basic
    @Column(name = "ata_adi")
    public String getAtaAdi() {
        return ataAdi;
    }

    public void setAtaAdi(String ataAdi) {
        this.ataAdi = ataAdi;
    }

    @Basic
    @Column(name = "doqulduqu_yer")
    public String getDoqulduquYer() {
        return doqulduquYer;
    }

    public void setDoqulduquYer(String doqulduquYer) {
        this.doqulduquYer = doqulduquYer;
    }

    @Basic
    @Column(name = "doqulduqu_tarix")
    public Date getDoqulduquTarix() {
        return doqulduquTarix;
    }

    public void setDoqulduquTarix(Date doqulduquTarix) {
        this.doqulduquTarix = doqulduquTarix;
    }

    @Basic
    @Column(name = "seriya")
    public int getSeriya() {
        return seriya;
    }

    public void setSeriya(int seriya) {
        this.seriya = seriya;
    }

    @Basic
    @Column(name = "aile_vezyeti")
    public String getAileVezyeti() {
        return aileVezyeti;
    }

    public void setAileVezyeti(String aileVezyeti) {
        this.aileVezyeti = aileVezyeti;
    }

    @Basic
    @Column(name = "herbi_vezife")
    public String getHerbiVezife() {
        return herbiVezife;
    }

    public void setHerbiVezife(String herbiVezife) {
        this.herbiVezife = herbiVezife;
    }

    @Basic
    @Column(name = "qan_qrup")
    public String getQanQrup() {
        return qanQrup;
    }

    public void setQanQrup(String qanQrup) {
        this.qanQrup = qanQrup;
    }

    @Basic
    @Column(name = "goz_rengi")
    public String getGozRengi() {
        return gozRengi;
    }

    public void setGozRengi(String gozRengi) {
        this.gozRengi = gozRengi;
    }

    @Basic
    @Column(name = "cinsi")
    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Basic
    @Column(name = "yasayis_yeri")
    public String getYasayisYeri() {
        return yasayisYeri;
    }

    public void setYasayisYeri(String yasayisYeri) {
        this.yasayisYeri = yasayisYeri;
    }

    @Basic
    @Column(name = "boyu")
    public int getBoyu() {
        return boyu;
    }

    public void setBoyu(int boyu) {
        this.boyu = boyu;
    }

    @Basic
    @Column(name = "vesiqeni_veren_orqan")
    public String getVesiqeniVerenOrqan() {
        return vesiqeniVerenOrqan;
    }

    public void setVesiqeniVerenOrqan(String vesiqeniVerenOrqan) {
        this.vesiqeniVerenOrqan = vesiqeniVerenOrqan;
    }

    @Basic
    @Column(name = "vesqienin_verilme_tarixi")
    public Date getVesqieninVerilmeTarixi() {
        return vesqieninVerilmeTarixi;
    }

    public void setVesqieninVerilmeTarixi(Date vesqieninVerilmeTarixi) {
        this.vesqieninVerilmeTarixi = vesqieninVerilmeTarixi;
    }

    @Basic
    @Column(name = "etibarlidir")
    public Date getEtibarlidir() {
        return etibarlidir;
    }

    public void setEtibarlidir(Date etibarlidir) {
        this.etibarlidir = etibarlidir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdentityCard that = (IdentityCard) o;

        if (id != that.id) return false;
        if (seriya != that.seriya) return false;
        if (boyu != that.boyu) return false;
        if (ad != null ? !ad.equals(that.ad) : that.ad != null) return false;
        if (soyad != null ? !soyad.equals(that.soyad) : that.soyad != null) return false;
        if (ataAdi != null ? !ataAdi.equals(that.ataAdi) : that.ataAdi != null) return false;
        if (doqulduquYer != null ? !doqulduquYer.equals(that.doqulduquYer) : that.doqulduquYer != null) return false;
        if (doqulduquTarix != null ? !doqulduquTarix.equals(that.doqulduquTarix) : that.doqulduquTarix != null)
            return false;
        if (aileVezyeti != null ? !aileVezyeti.equals(that.aileVezyeti) : that.aileVezyeti != null) return false;
        if (herbiVezife != null ? !herbiVezife.equals(that.herbiVezife) : that.herbiVezife != null) return false;
        if (qanQrup != null ? !qanQrup.equals(that.qanQrup) : that.qanQrup != null) return false;
        if (gozRengi != null ? !gozRengi.equals(that.gozRengi) : that.gozRengi != null) return false;
        if (cinsi != null ? !cinsi.equals(that.cinsi) : that.cinsi != null) return false;
        if (yasayisYeri != null ? !yasayisYeri.equals(that.yasayisYeri) : that.yasayisYeri != null) return false;
        if (vesiqeniVerenOrqan != null ? !vesiqeniVerenOrqan.equals(that.vesiqeniVerenOrqan) : that.vesiqeniVerenOrqan != null)
            return false;
        if (vesqieninVerilmeTarixi != null ? !vesqieninVerilmeTarixi.equals(that.vesqieninVerilmeTarixi) : that.vesqieninVerilmeTarixi != null)
            return false;
        if (etibarlidir != null ? !etibarlidir.equals(that.etibarlidir) : that.etibarlidir != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ad != null ? ad.hashCode() : 0);
        result = 31 * result + (soyad != null ? soyad.hashCode() : 0);
        result = 31 * result + (ataAdi != null ? ataAdi.hashCode() : 0);
        result = 31 * result + (doqulduquYer != null ? doqulduquYer.hashCode() : 0);
        result = 31 * result + (doqulduquTarix != null ? doqulduquTarix.hashCode() : 0);
        result = 31 * result + seriya;
        result = 31 * result + (aileVezyeti != null ? aileVezyeti.hashCode() : 0);
        result = 31 * result + (herbiVezife != null ? herbiVezife.hashCode() : 0);
        result = 31 * result + (qanQrup != null ? qanQrup.hashCode() : 0);
        result = 31 * result + (gozRengi != null ? gozRengi.hashCode() : 0);
        result = 31 * result + (cinsi != null ? cinsi.hashCode() : 0);
        result = 31 * result + (yasayisYeri != null ? yasayisYeri.hashCode() : 0);
        result = 31 * result + boyu;
        result = 31 * result + (vesiqeniVerenOrqan != null ? vesiqeniVerenOrqan.hashCode() : 0);
        result = 31 * result + (vesqieninVerilmeTarixi != null ? vesqieninVerilmeTarixi.hashCode() : 0);
        result = 31 * result + (etibarlidir != null ? etibarlidir.hashCode() : 0);
        return result;
    }
}
