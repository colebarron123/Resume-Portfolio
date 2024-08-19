import json
import urllib.request
import datetime
import math

#Cole Barron
#This is a program I wrote in Summer 2024 that uses a weather API to display
#the weather conditions of the zipcode you are in!

zipCode = "30102"
usrName = "cbarron614"
apiKey = "967f3364520245845547f2ecd414e813"
cityName = ""
currentTemp = 0.00
atmoPressure = 0
windSpeed = 0
windDir = ""
timestamp = ""

getURL = "https://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + ",us&appid=" + apiKey

def truncate(number, digits) -> float:
    stepper = 10.0 ** digits
    return math.trunc(stepper * number) / stepper

response = urllib.request.urlopen(getURL)
decoded_response = response.read().decode('utf-8')
jsonobj = json.loads(decoded_response)

cityName = jsonobj["name"]
currentTemp = truncate((jsonobj["main"]["temp"] * 9/5) - 459.67, 2)
atmoPressure = jsonobj["main"]["pressure"]
windSpeed = jsonobj["wind"]["speed"]
windDir = jsonobj["wind"]["deg"]
timestamp = datetime.datetime.utcfromtimestamp(jsonobj["dt"]).strftime('%y-%m-%d %H:%M:%S')

print("=== Weather in " + cityName + " (" + zipCode + ") ===")
print("Current Temperature: " + str(currentTemp) + " deg F")
print("Atmospheric Presure: " + str(atmoPressure) + " hPa")
print("Wind Speed: " + str(windSpeed) + " mpg")
print("Wind Direction: " + str(windDir) + " deg")
print("Timestamp: " + timestamp)