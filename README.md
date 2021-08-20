Project - "Unique Device Code"
=========================

It is a huge pain to make the UUID of a mobile device, Google recommends not to bind to hardware data, but to use an advertising identifier. 
But the fact is that during a clean installation of the application, both the Firebase ID and the advertising ID are reset.

My solution
=========================

So far I decided for myself that the most optimal way is to use androidId
in rare cases, when we cannot get it, then generate a pseudo random UUID based on the phone hardware data and SERIAL ID

There is a DeviceUtils object that has a getUniquePseudoIDWithAndroidId(context: Context?) method. 
It returns UUID based on Android Id, if not, then generates a pseudo random UUID based on phone hardware

License
-------
Copyright 2021 Erdem Tsynduev

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations und