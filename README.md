# Assignment_project
Week1 - Flick
SimpleTodoList is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: Flicks

Time spent: 3 hours spent in total

User Stories

The following user stories must be completed:

User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API. (5 points)
Lists should be fully optimized for performance using the ViewHolder pattern to cache view lookups within the adapter. (2 points)
Views should be responsive for both landscape/portrait mode. (3 points)
In portrait mode, the poster image, title, and movie overview is shown.
In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.
The following advanced user stories are optional but recommended:

Display a nice default placeholder graphic for each image during loading (read more about Picasso) (1 point)
Improve the user interface through styling and coloring (1 to 5 points depending on the difficulty of UI improvements)
For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous ListViews and use different ViewHolder layout files for popular movies and less popular ones. (2 points)
Stretch: Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity. (3 points)
Stretch: Allow video posts to be played in full-screen using the YouTubePlayerView (2 points)
When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
See the videos API for video information. Here's a sample request.
Stretch: Add a play icon overlay to popular movies to indicate that the movie can be played (1 point).
Stretch: Apply the popular ButterKnife annotation library to reduce view boilerplate. (1 point)
Stretch: Add a rounded corners for the images using the Picasso transformations. (1 point)
Stretch: Replace android-async-http network client with the popular OkHttp networking library for all TheMovieDB API calls. (1 point)
Cliffnotes:
