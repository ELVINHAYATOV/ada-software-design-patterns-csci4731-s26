package az.edu.ada.modules.module08;

import java.util.ArrayList;
import java.util.List;

public class TradingBot {

	private final List<Double> priceHistory = new ArrayList<>();
	private TradingStrategy tradingStrategy;

	public void addPrice(double price) {
		priceHistory.add(price);
	}

	public void setTradingStrategy(TradingStrategy tradingStrategy) {
		this.tradingStrategy = tradingStrategy;
	}

	public void evaluate() {
		if (tradingStrategy == null || priceHistory.isEmpty()) {
			return;
		}

		if (tradingStrategy.shouldExecuteTrade(priceHistory)) {
			double latestPrice = priceHistory.get(priceHistory.size() - 1);
			System.out.println("Trade Executed at price: " + latestPrice);
		}
	}
}
