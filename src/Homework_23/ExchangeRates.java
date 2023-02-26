package Homework_23;

//Знайти API курсу валют будь якого банку та розпарсити (витягти) інформацію стосовно усіх значень в API та записати до JSON файлу в пакеті

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class ExchangeRates {
        @JsonProperty("r030")
        private BigDecimal r030;

        @JsonProperty("txt")
        private String txt;

        @JsonProperty("rate")
        private BigDecimal rate;

        @JsonProperty("cc")
        private String cc;

        @JsonProperty("exchangedate")
        private String exchangedate;


        public ExchangeRates() {
        }

    public ExchangeRates(BigDecimal r030, String txt, BigDecimal rate, String cc, String exchangedate) {
        this.r030 = r030;
        this.txt = txt;
        this.rate = rate;
        this.cc = cc;
        this.exchangedate = exchangedate;
    }

    public BigDecimal getR030() {
        return r030;
    }

    public void setR030(BigDecimal r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "r030=" + r030 +
                ", txt='" + txt + '\'' +
                ", rate=" + rate +
                ", cc='" + cc + '\'' +
                ", exchangedate='" + exchangedate + '\'' +
                '}';
    }
}

