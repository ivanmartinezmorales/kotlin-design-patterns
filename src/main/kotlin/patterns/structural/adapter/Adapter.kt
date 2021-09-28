package patterns.structural.adapter

/**
 * The Adapter pattern.
 *
 * The adapter pattern is a structural pattern
 * with the intention of converting one interface
 * into another interface. In this pattern, we
 * create an object that wraps our own object
 * so that the outer object can understand what
 * the inner object is trying to do. The object
 * that is wrapped isn't aware that it's being
 * wrapped, it just knows that it is getting data
 * as it normally would.
 *
 */

class Adapter {
    interface CurrencyConverter {
        fun convertCurrency(countryName: String): String
    }
}