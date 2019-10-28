# 9gag

Design pattern used: MVVM

Using this Google recommended architecture as I believe it gives the most flexibility when it comes to scaling your app up into a large enterprise size app. Coupling this with Dagger allows everything to be decoupled making it easy to add or remove modules as and when needed.

I implemented Room that stores the gags for offline viewing - however I am unsure if this is required. But for testing purposes I have left it in to show that I can use it.

Improvements for the future:

Initally, when I saw the requirements of the test I thought the endpoint would supply an "offset" and "limit" to properly implement pagination. I've never actually implemented endless scrolling in the way I did here before, so if this was a serious project of mine - I would want to reimplement this in the correct way with some backend changes.

I would like to implement more tests going forward. I only put a few in to prove I can but want to keep the test as short as possible. (hope this is acceptable)

Implement account section, a real trending page, fresh page and many other user enhancement features.
