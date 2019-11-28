package wangdaye.com.geometricweather.main.ui.adapter.trend;

import androidx.annotation.NonNull;

import java.util.TimeZone;

import wangdaye.com.geometricweather.basic.GeoActivity;
import wangdaye.com.geometricweather.basic.model.option.unit.PrecipitationUnit;
import wangdaye.com.geometricweather.basic.model.weather.Weather;
import wangdaye.com.geometricweather.main.ui.MainColorPicker;
import wangdaye.com.geometricweather.resource.provider.ResourceProvider;
import wangdaye.com.geometricweather.ui.widget.trend.TrendRecyclerView;

public class DailyPrecipitationAdapter extends wangdaye.com.geometricweather.ui.widget.trend.adapter.DailyPrecipitationAdapter {

    public DailyPrecipitationAdapter(GeoActivity activity, TrendRecyclerView parent, float cardMarginsVertical, float cardMarginsHorizontal, int itemCountPerLine, float itemHeight, String formattedId, @NonNull Weather weather, @NonNull TimeZone timeZone, ResourceProvider provider, MainColorPicker picker, PrecipitationUnit unit) {
        super(activity, parent, cardMarginsVertical, cardMarginsHorizontal, itemCountPerLine, itemHeight, formattedId, weather, timeZone, provider, picker, unit);
    }
}
