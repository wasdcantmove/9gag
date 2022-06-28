# 9gag

Design pattern used: MVVM
Using this Google recommended architecture as I believe it gives the most flexibility when it comes to scaling your app up into a large enterprise size app. Coupling this with Hilt allows everything to be decoupled making it easy to add or remove modules as and when needed.
I implemented Room that stores the gags for offline viewing, potentially for storing other account information in the future.


Improvements for the future:
I hardcoded a video to be in the 4th position, I would prefer to make this implementation better in the future.
Update code base to use data bindings as kotlin extensions are deprecated.
Implement account section, a real trending page, fresh page and many other user enhancement features.
