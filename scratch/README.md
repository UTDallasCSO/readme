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
 
#####**Drawing various images**
----
Seq # | Description | Code | Scene
---|---|---|---
2A | Let us select Pencil from sprite library & delete cat. You can delete the cat. Now edit the costume of Pencil and adjust the size and position so that the tip aligns with + sign. Now, review this code closely and guess what shape it is going to draw first. Now, build the script and try to validate your assumption. Now, modify this code and learn to draw a few other related shapes. | ![2a](http://www.utdallas.edu/~veerasam/scratch/index_files/image030.png) | ![2a2](http://www.utdallas.edu/~veerasam/scratch/index_files/image032.jpg)
2B | Thanks to repeat block, code in 2A can be shortened. Draw a few other shapes using this approach. Now, try to draw a circle using this approach. Hint: Take tiny steps and turn little bit at a time. | ![2b](http://www.utdallas.edu/~veerasam/scratch/index_files/image033.png)
2C | Here is a fancy drawing. Review the code first & try to understand. What is going on here? Now code it and see it in action. Change a few parameters carefully (think about it before you change) and see how the drawing changes. | ![2c](http://www.utdallas.edu/~veerasam/scratch/index_files/image034.png) | ![2c2](http://www.utdallas.edu/~veerasam/scratch/index_files/image035.png)
2D | Look at the drawing and think how can try to draw it.  You can use setpencolor 128 for blue color. Also, you can use setpensize 2 for a thicker line. | | ![2d](http://www.utdallas.edu/~veerasam/scratch/index_files/image036.png)
2E | Statement like change pen color by 5 enables us to change the color as we progress. | | ![2e](http://www.utdallas.edu/~veerasam/scratch/index_files/image037.png)
 
#####**Power of Variables**
----
Just like humans, computers can remember data! In fact, unlike humans, it can store, modify and retrieve huge amount of data!! Scratch has several in-built variables already: x, y, direction, pen color, color shade (thickness), etc. In addition,  user can define variables too.

Seq # | Description | Code | Scene
---|---|---|---
3A | Expanding Squares: Let us continue to use Pencil sprite. Go under Data, click on “Make a Variable”. Each variable needs a name. Let us use “len” to indicate the length of a line. Now, start to draw like a square – but increasing “len”. Note: drawing gets affected once you reach the edge of drawing area, so stop before you reach the edge. | ![3a](http://www.utdallas.edu/~veerasam/scratch/index_files/image038.png) | ![3a2](http://www.utdallas.edu/~veerasam/scratch/index_files/image039.png)
3B | How will you adjust the color as it proceeds? See the output. Now, draw expanding hexagons, triangles! | ![3b2](http://www.utdallas.edu/~veerasam/scratch/index_files/image040.png)
3C | To draw a circle, we need to make a few adjustments: Draw a small line, turn little bit, draw bigger line, ... | ![3c](http://www.utdallas.edu/~veerasam/scratch/index_files/image041.png) | ![3c2](http://www.utdallas.edu/~veerasam/scratch/index_files/image042.png) 
3D | Make the code changes to generate a drawing like this one. Note: Remember, there are 200 shades of color (0 to 199, 200 and above will wrap-around):![3d](http://wiki.scratch.mit.edu/w/images/Pen_color.png) Key thing is to change the color every time so that the color shade goes up by 200 for every 360 degrees. So, increase shade by (200/(360/5)) = (200/72) = 2.77777778 every time inside the loop! | | ![3d3](http://www.utdallas.edu/~veerasam/scratch/index_files/image043.png)
3E | Let us return back to Cat. Make the cat walk back and forth (or) make it go in a circle. Increase/decrease the speed gradually. Basically, walk slowly first, gradually increase the speed along the way, once max speed is achieved, gradually decrease the speed back to minimum, so on. Hint: Define step as a variable, and increase/decrease it inside the loop.
3F | As the Cat walks back and forth or goes around in a circle, shrink and expand the size of the cat (10% --> 200% --> 10% ...). As it walks make the size bigger. Once a maximum size is reached, keep decreasing the size until it becomes very small. Use a variable in to shrink and expand the cat. | 10% Size: ![3f](http://www.utdallas.edu/~veerasam/scratch/index_files/image047.png)
3G | Set rotation style to left-right first, make the cat walk back and forth (NOT circle) – vary the walking distance: Walk for small distance first and turn. Now, walk some more distance and turn, now some more distance so on...Once a max distance is reached, now keep reducing the walking distance, until the walking distance becomes very small.

#####**Looks & Costumes**
-----
Seq # | Description | Code | Scene
---|---|---|---
4A | As Cat walks, switch between 2 poses (also known as costumes) | ![4a](http://www.utdallas.edu/~veerasam/scratch/index_files/image049.png) | ![4a2](http://www.utdallas.edu/~veerasam/scratch/index_files/image050.png)
4B | Try the same approach with your favorite sprite. Following ones are good: boy3 boy3 walking ghost2 shark | | ![4b](http://www.utdallas.edu/~veerasam/scratch/index_files/image051.png)
4C | Choose ballerina sprite (it has 4 costumes/poses!) and make her to do the act again & again (by switching between them continuously)!  If you want another sprite, try pico! | | ![4c](http://www.utdallas.edu/~veerasam/scratch/index_files/image055.png)
4D | Do this at home! Take photos of a few poses of interesting object (it can be you!) doing funny moves, load them as costumes for a sprite and switch between them in a loop!
4E | Select ghost2 and let us make it go around the city! Select a few favorite backdrops (fancy term for Background!) & delete the original white backdrop. Similar to sprite library, there is a library for backdrops too. | ![4E](http://www.utdallas.edu/~veerasam/scratch/index_files/image056.png) | ![4E2](http://www.utdallas.edu/~veerasam/scratch/index_files/image057.png)
4F | Make it more fancy! We want to change the backdrop only when the ghost reaches the right end (you can check whether x > 225. Also, move the ghost to left end! Now, the ghost is really visiting the city, right? | ![4f](http://www.utdallas.edu/~veerasam/scratch/index_files/image058.png)
4G | Go ahead and add a few more enhancements! Or, add your favorite sprite and make it roam through nature ... (there are lot of backdrops for nature). | ![4g](http://www.utdallas.edu/~veerasam/scratch/index_files/image059.png) | ![4g](http://www.utdallas.edu/~veerasam/scratch/index_files/image060.png)

#####**Events**
-----
Seq # | Description | Code | Scene
---|---|---|---
5A | We cannot play a game without user interaction, right? Events is all about user interactions. Let us start with Start and Stop signs. Write 2 blocks of code – they will run in parallel when Start flag is pressed! | ![5a](http://www.utdallas.edu/~veerasam/scratch/index_files/image061.png) | ![5A2](http://www.utdallas.edu/~veerasam/scratch/index_files/image062.png)
5B | You can write code that get triggered by keyboard inputs. Add the following simple blocks of code (in addition to code in 5A) – now press b and s repeatedly. Now, click on Start flag, then press b and s to see the effect. | ![5B](http://www.utdallas.edu/~veerasam/scratch/index_files/image063.png) | ![5B](http://www.utdallas.edu/~veerasam/scratch/index_files/image064.png)
5C | How about leaving a stamp along the way? Every time when you press c, it will leave a stamp! | ![5C](http://www.utdallas.edu/~veerasam/scratch/index_files/image066.png) | ![5C2](http://www.utdallas.edu/~veerasam/scratch/index_files/image067.png)
5D | Do this at home (not sure lab will be quite enough to do this one)! Add this code and talk at the computer to make the Cat bigger! | ![5D](http://www.utdallas.edu/~veerasam/scratch/index_files/image068.png)
5E | Do this at home too! Start fresh and do this code alone. As the Cat gets smaller, say something! It will get bigger!! Do your own extensions!!! | ![5E](http://www.utdallas.edu/~veerasam/scratch/index_files/image069.png)

#####**Sensing**
-----
Seq # | Description | Code | Scene
---|---|---|---
6A | How about changing color in addition to bouncing when an edge is reached? Feel free to make your own modifications. | ![6A](http://www.utdallas.edu/~veerasam/scratch/index_files/image070.png) |![6A2](http://www.utdallas.edu/~veerasam/scratch/index_files/image071.png)
6B | Try to do the same with a ball (assign random color when it bounces). Also, make it bounce in all 4 edges.
6C | As the cat is walking back and forth, it is tired and goes down a bit in size! Let us introduce a mouse along the way. As the cat crosses the mouse, cat eats it and grows in size! Add Mouse sprite and complete this code. You can move the mouse around to control cat’s size. You can also play with the values in the program. | ![6C](http://www.utdallas.edu/~veerasam/scratch/index_files/image072.png) | ![6C2](http://www.utdallas.edu/~veerasam/scratch/index_files/image073.png)
6D | Here is the same program with a small twist. Enhance the program so that cat does not become huge! Once it reaches the certain size, it can say “I am not hungry anymore. Let us play!” when it gets to close to the mouse! Use your creativity to enhance it more!! | ![6D](http://www.utdallas.edu/~veerasam/scratch/index_files/image074.png) | ![6D2](http://www.utdallas.edu/~veerasam/scratch/index_files/image075.png)
6E | [This](scratch.mit.edu/projects/15147375) shows another silly version. Review & understand the code for both sprites first. Note that it uses “distance to” function. Now, make the code changes to freeze the mouse when cat comes close to it. Another version would be to disguise as a bug. Create your own variations! 

#####**Starter Projects**
-----
Seq # | Description | Code | Scene
---|---|---|---
7A | Greeting Card: scratch.mit.edu/projects/11806234 Play it first. Then, click on to see the code behind this project. Review the code for this project first, then enhance it to make your favorite object to glide in when the greeting card is opened. You can control the glide speed by specifying the duration. | | ![7a](http://www.utdallas.edu/~veerasam/scratch/index_files/image079.png)
7B | Pong Starter: scratch.mit.edu/projects/10128515 Review the code first, then make the following enhancements: Introduce a variable “score” to keep track of # of successful bounces. Increase the speed of the ball after each bounce, or introduce levels and increase the speed when the score reaches 10, 20, 30, etc. (change backdrop too?) Right-click on Ball sprite and duplicate it! Then, go to code for Ball2 and set the starting location x = 120 (instead of 20) and change the color to your favorite one! Now, play the game with 2 balls! | ![7b](http://www.utdallas.edu/~veerasam/scratch/index_files/image080.png)
7C | http://scratch.mit.edu/projects/15768956/ Play this Shark-Fish game and review the code to understand. Then, think of your own enhancements and have fun with it! | | ![7c](http://www.utdallas.edu/~veerasam/scratch/index_files/image082.jpg)
 
#####**Video tutorials**
-------
[Wizard Game](http://scratch.mit.edu/help/videos/#)

#####**Advanced Games**
-----
Escape the Box: http://scratch.mit.edu/projects/3047921/#editor
Burger Cat Test: http://scratch.mit.edu/projects/2286584/#editor
Tic Tac Toe: http://scratch.mit.edu/projects/1425/

#####**Advanced Topics**
Output | Code
---- | -----
![1](http://www.utdallas.edu/~veerasam/scratch/index_files/image083.png) | http://scratch.mit.edu/projects/11937841
![2](http://www.utdallas.edu/~veerasam/scratch/index_files/image084.png) | http://scratch.mit.edu/projects/22119922
![3](http://www.utdallas.edu/~veerasam/scratch/index_files/image085.png) | http://scratch.mit.edu/projects/22120049
![4](http://www.utdallas.edu/~veerasam/scratch/index_files/image086.png) | http://scratch.mit.edu/projects/22288874
