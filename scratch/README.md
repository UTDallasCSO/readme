# Scratch Workshop: Introduction to Programming

###Contents
1. [What is Scratch?](#what-is-scratch?)
2. [Getting Started!](#getting-started!)
3. [Scripts](#scripts)
4. [Examples](#examples)
5. [Starter Projects/ Video Tutorials](#starter-projects-video-tutorials)

####What is Scratch?
Scratch is a visual programming environment where you design/create your interactive stories, games & animations. While Scrtach has been designed with a typical 3rd or 4th grader in mind, people of all ages can use it to learn the basics of programming in an enjoyable way! Scratch involves drag and drop of various blocks together to write programs & such an environment enables the users to focus on the logic & enjoy the learning experience! Unlike most Java/C++ development environments, there is NO free-form typing, so there are syntax errors either! Scratch is not limted to young people though - people of all ages with no programming experience can enjoy its simplicity and learn the basics of programming!

####Getting Started!
We use web based application development interface for Scratch Programming:
* Home: http://scratch.mit.edu/
* Create New: http://scratch.mit.edu/projects/editor/?tip_bar=getStarted
 
1. Each object in Scratch is called a sprite. Default sprite is a cat.
2. The background for the sprite is called Stage OR backdrop.
3. Scripts can be dragged and placed/appended on to the grey workspace (towards right). Each group of scripts is run upon double-clicking the first block of script OR by triggering the event.
4. New sprites and backdrops can be added. Each sprite and backdrop is associated with respective sequence of scripts.
![Scratch homescreen](http://www.utdallas.edu/~veerasam/scratch/index_files/image004.jpg)
![Scratch interface](http://www.utdallas.edu/~veerasam/scratch/index_files/image005.gif)

####Scripts

**Note**
* [This](http://scratched.gse.harvard.edu/resources/search/results/taxonomy%3A28) link contains the 'suggested curriculum' as suggested on the official Scratch website
* [This](http://scratched.gse.harvard.edu/resources) link has content curated according to age groups. 

There are tons of actions we can do with each object – it will be too long to list them together! Instead, Scratch folks have grouped “related” actions together and placed under 10 different categories. All actions in each category are color-coded too.

Script | Description
------ | ------
Motion | move, turn, set position and defines motion of sprite including what to do when it touches the edge.
Looks | Make sprite to say, think, show, hide, switch costume/backdrop & change color. Costume is a fancy term for pose. Each object may have several constumes/poses – we can switch them as they move to make the animation! We can also go under Costumes tab to modify the current costumes and draw the additional ones!
Sound | play different sounds, stop, change volume and tempo
Pen | Make pen up, down, clear, change color and size – If you move the object after making pen down, it will keep drawing until the pen is up!
Events | We can make a block of code when a particular event occurs. Here are a few examples for events: <ul><li> a particular key is pressed, <li> mouse is pressed on an object <li> make a loud noise!</li></ul>
Control | Control structures like if-then, if-then-else, wait, repeat loops, ... if-then & if-then-else add intelligence to program! Based on a condition, we can execute one path or another path! Repeat loop enables us to repeat # of steps again & again.
Sensing | situations of sensing (ex. mouse down) and other environmental actions – This rich set of senses enable the programs to be responsive and enable us to do animations and games.
Operators | arithmetic and logical operators, random number generator and few functions <ul><li>we can compute using arithmetic expressions, we can check for complicated conditions using logical operators.<li> random number generator enables us to draw random figure or make random moves or turns – with the same code, random numbers enable us to draw random shapes! Even simple games utilize randomness to make random choices every time the game is played.</ul>
Data | Create new variables (re-used in other scripts) and lists

#####Useful Shortcuts
* Script Pen>>Clear [Clears pen moves on screen]
* Script Motion>>go to x: 0 y: 0 [Sets the sprite at center of stage]
* Toolbar File>>Revert [Resets sprite to start]

Reference sheet : http://tinyurl.com/scratchblocks

####Examples
1. [Simple Animations using 1 object](#simple-animations-using-1-object)
2. [Drawing various images](#drawing-various-images)
3. [Power of Variables](#power-of-variables)
4. [Looks & Costumes](#looks-&-costumes)
5. [Events](#events)
6. [Sensing](#sensing)
7. [Starter Projects](#starter-projects)
8. [Advanced Games](#advanced-games)
9. [Advanced Topics](#advanced-topics)

#####**Simple Animations using 1 object**
----
Seq # | Description | Code | Scene
---|---|---|---
1A | Make the cat walk back & forth. After building this code block, you can simply click anywhere on the block to run! Click on it again to stop. What happens when the cat reaches the edge? | ![1a](http://www.utdallas.edu/~veerasam/scratch/index_files/image006.png) | 
1B | We want it to turn around when it reaches the edge, right? | ![1b](http://www.utdallas.edu/~veerasam/scratch/index_files/image007.png)
1C | Let us make it bounce around all edges! | ![1c](http://www.utdallas.edu/~veerasam/scratch/index_files/image008.png) 
1D | Now that it makes crazy moves, let us trace its path! | ![1d](http://www.utdallas.edu/~veerasam/scratch/index_files/image009.png) | ![1d2](http://www.utdallas.edu/~veerasam/scratch/index_files/image011.jpg)
1E | Tired of blue color? Let us change the colors along the way! Pen colors have been arranged in a sequence – you can keep going to the next color within the loop...Ok, how do the colors work in Scratch? Well, there are 200 shades of color (0 to 199, 200 and above will wrap-around)| ![1e](http://www.utdallas.edu/~veerasam/scratch/index_files/image013.png) | ![1e2](http://www.utdallas.edu/~veerasam/scratch/index_files/image015.jpg)
1F | Instead of tracing its path, you want more cats? | ![1f](http://www.utdallas.edu/~veerasam/scratch/index_files/image016.png) | ![1f2](http://www.utdallas.edu/~veerasam/scratch/index_files/image018.jpg)
1G | Circle of cats! As it moves & turns, make an impression using stamp! Extra steps above repeat loop help us to see the whole big circle of cats! | ![1g](http://www.utdallas.edu/~veerasam/scratch/index_files/image020.jpg) | ![1g2](http://www.utdallas.edu/~veerasam/scratch/index_files/image022.jpg)
1H | Back to basics: Make the cat walk back & forth normally. We do not want it to go upside down! | ![1h](http://www.utdallas.edu/~veerasam/scratch/index_files/image023.png) 
1I | Since cat has one more costume (pose), let us try to use it for walking! You can look at the posts by clicking on Costumes tab. | ![1i](http://www.utdallas.edu/~veerasam/scratch/index_files/image024.png)
1J | Instead of clicking on the block, we can click on Green flag with this code! Press Stop sign to stop the execution. | ![1j](http://www.utdallas.edu/~veerasam/scratch/index_files/image025.png)
1K | Make the Cat roll while changing color and playing sound. Let us trigger the block of code to run when space key is pressed. You may need to introduce set rotation style all around to make the turns to work properly. | ![1k](http://www.utdallas.edu/~veerasam/scratch/index_files/image026.png)
1L | Multi-size cat problem! Cats keep growing until you press s! Then, it becomes small, but they start growing as soon as you release s key. | ![1l](http://www.utdallas.edu/~veerasam/scratch/index_files/image027.png) | ![1l2](http://www.utdallas.edu/~veerasam/scratch/index_files/image029.jpg)
 
####Starter Projects/ Video Tutorials

