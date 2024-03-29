﻿namespace MyFirstWebApplication.Models
{

    /// <summary>
    /// Прогноз погоды
    /// </summary>
    public class WeatherForecast
    {

        /*private DateTime _date;

        public DateTime GetDate()
        {
            return _date;
        }

        public void SetDate(DateTime date)
        {
            _date = date;
        }*/

        /// <summary>
        /// Дата измерения
        /// </summary>
        public DateTime Date { get; set; }

        /// <summary>
        /// Температура в градус Цельсия
        /// </summary>
        public int TemperatureC { get; set; }

        /// <summary>
        /// Температура в градус Форенгейта
        /// </summary>
        public int TemperatureF
        {
            get { return 32 + (int)(TemperatureC / 0.5556); }
        }


        public WeatherForecast(DateTime date, int teTemperatureC)
        {
            Date = date;
            TemperatureC = teTemperatureC;
        }

        public WeatherForecast(DateTime date)
        {
            Date = date;
        }
    }
}
