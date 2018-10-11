# AMSoft

## What are we planning to build
A system that will demarcate potential urban flood zones and accordingly notify the citizens in the proximity to move to safe locations along with suitable directions. It will also notify concerned authorities to take suitable action.
Based upon the DEM images of the city, the model will precompute the areas which have high possibility of getting affected in case a flood occurs. The system will notify the people living in  that area through SMS to move to some safer location. SMS will include the nearest safest locations along with the directions to reach that location.
Concerned authorities will get notified with a suggested plan of action to be undertaken in accordance with the Government of India’s Standard Operating procedures for Urban flooding.

## How does it work
Notifications along with directions to all the concerned departments.
We can use weather forecast (API like OpenWeatherMap) to determine the possibility of heavy rainfall in the region. Along with this, the present sea level can also be a major indicator for occurence of flood. 

## How users can get started with the project
Users will have to register their phone number on database, after which they will recieve realtime update of urban floods and best evacuation path in case of flood.

## What dataset(s) are we using
CartoDEM
Planet Dataset


## What technologies are we using
<a href="https://github.com/adityaketkar/AMSoft/blob/master/README.md#my-anchor">Digital Elevation Models</a>
OpenWeatherMap API for weather forecasting
    

### What is Digital Elevation Model(DEM) ? 
A DEM is very similar to a map, but it gives us information about the elevation of a point above sea level.
For example, here is the DEM of India. Observe the difference between elevation in North (The Himalayas) and south western coastal regions.


<a name="my-anchor"></a>
![Digital Elevation Model Of India](https://www.researchgate.net/profile/Sitharam_Thallak/publication/263699748/figure/fig7/AS:268820552089604@1441103222150/Digital-elevation-model-SRTM-DEM-for-entire-India-resampled-to-0101-grid-size.png)

