Feature: This tests are created for weather testing
    Scenario: Testing coordinates
# http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22
# https://openweathermap.org/current

      When we are requesting weather
#CORD
        Then LON should be -0.13
         And LAT should be 51.51
#WEATHER
        And weather list should be:
        | id  | main     | description             | icon |
        | 300 | Drizzle  | light intensity drizzle | 09d  |

#BASE
        And BASE should be stations
#MAIN
        And TEMP should be 280.32
         And PRESSURE should be 1012
         And HUMIDITY should be 81
         And TEMP_MIN should be 279.15
         And TEMP_MAX should be 281.15
#VISIBILITY
        Then VISIBILITY should be 10000
#WIND
        Then SPEED should be 4.1
         And DEG should be 80
#CLOUDS
        Then ALL should be 90
#DT
        Then DT should be 1485789600
#SYS
        Then TYPE should be 1
         And SYS_ID should be 5091
         And MESSAGE should be 0.0103
         And COUNTRY should be GB
         And SUNRISE should be 1485762037
         And SUNSET should be 1485794875
#ID
        Then ID should be 2643743
#NAME
        Then NAME should be London
#COD
        Then COD should be 200