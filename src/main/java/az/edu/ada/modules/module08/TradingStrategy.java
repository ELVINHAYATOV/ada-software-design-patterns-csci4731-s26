package az.edu.ada.modules.module08;

import java.util.List;

public interface TradingStrategy {
	boolean shouldExecuteTrade(List<Double> priceHistory);
}
