package xrate;

import java.io.IOException;

/**
 * Provide access to basic currency exchange rate services.
 *
 * @author skeleton keyboard
 */
public class ExchangeRateReader {
      String urlString;
    /**
     * Construct an exchange rate reader using the given base URL. All requests
     * will then be relative to that URL. If, for example, your source is Xavier
     * Finance, the base URL is http://api.finance.xaviermedia.com/api/ Rates
     * for specific days will be constructed from that URL by appending the
     * year, month, and day; the URL for 25 June 2010, for example, would be
     * http://api.finance.xaviermedia.com/api/2010/06/25.xml
     *
     * @param baseURL
     *            the base URL for requests
     */
    public ExchangeRateReader(String baseURL) {
        // TODO Your code here
        /*
         * DON'T DO MUCH HERE!
         * People often try to do a lot here, but the action is actually in
         * the two methods below. All you need to do here is store the
         * provided `baseURL` in a field so it will be accessible later.
         */
         String urlString = baseURL;

    }

    /**
     * Get the exchange rate for the specified currency against the base
     * currency (the Euro) on the specified date.
     *
     * @param currencyCode
     *            the currency code for the desired currency
     * @param year
     *            the year as a four digit integer
     * @param month
     *            the month as an integer (1=Jan, 12=Dec)
     * @param day
     *            the day of the month as an integer
     * @return the desired exchange rate
     * @throws IOException
     */
    public float getExchangeRate(String currencyCode, int year, int month, int day) throws IOException {
        String date = year + "-" + month + "-" + day; //  year append(-) month append(-) day;
        String dateUrl = urlString + date;
        /* add the key to the url
        call it urlString
        */
        URL url = new URL(urlString);
        InputStream inputStream = url.openStream();
        InputStreamReader in = new InputStreamReader(inputStream);
        JsonParser moneyList = new JsonParser().parse(in).getAsJsonObject();

        



        throw new UnsupportedOperationException();
    }

    /**
     * Get the exchange rate of the first specified currency against the second
     * on the specified date.
     *
     * @param fromCurrency
     *            the currency code we're exchanging *from*
     * @param toCurrency
     *            the currency code we're exchanging *to*
     * @param year
     *            the year as a four digit integer
     * @param month
     *            the month as an integer (1=Jan, 12=Dec)
     * @param day
     *            the day of the month as an integer
     * @return the desired exchange rate
     * @throws IOException
     */
    public float getExchangeRate(
            String fromCurrency, String toCurrency,
            int year, int month, int day) throws IOException {
        // TODO Your code here
        throw new UnsupportedOperationException();
    }
}
