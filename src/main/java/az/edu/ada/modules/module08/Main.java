package az.edu.ada.modules.module08;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, TradingStrategy> strategyList = new HashMap<>();
		strategyList.put("TREND", new TrendFollowerStrategy());
		strategyList.put("CONTRARIAN", new ContrarianStrategy());
		strategyList.put("PANIC", new PanicDropStrategy());

		TradingBot tradingBot = new TradingBot();
		tradingBot.setTradingStrategy(strategyList.get("CONTRARIAN"));

		double[] contrarianPrices = { 150.0, 148.0, 145.0, 142.0 };
		for (double price : contrarianPrices) {
			tradingBot.addPrice(price);
			tradingBot.evaluate();
		}

		tradingBot.setTradingStrategy(strategyList.get("TREND"));

		double[] trendPrices = { 144.0, 146.0, 149.0, 155.0 };
		for (double price : trendPrices) {
			tradingBot.addPrice(price);
			tradingBot.evaluate();
		}
	}
}
