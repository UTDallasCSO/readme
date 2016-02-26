# content
_Curated content for all tools and languages and camps taught under the auspices of the CS Outreach programs. You can conduct camps upto a week-long using just the material in this repo for the subject assigned to you._

###The whole idea is...
----
...to have a body of content ready for you, the CS Outreach instructors so that:
1. all participants can have a similar experience
2. you don't waste any time preparing content everytime you are assigned to a new tool, language or camp.
3. you can solely focus on the teaching part and not worry about content creation and know what you have to cover for a given camp or session so that you can pace yourself.

You are welcome to submit pull requests for corrections, enhancements, addition and modification of any of the content. :+1:

###Getting Started :pray:
---
1. Before you can start contributing, you will have to [sign-up for an account on Github](https://github.com/join?source=header-home). If you sign-up using your .edu email addresss, you can avail the student pack.
2. Next, head over to the CS Outreach organization page [here](https://github.com/utdallascso/) and request access to the repo '[content](github.com/utdallascso/content)'
3. You can now start contributing to the repo.
4. You will need to [install Git locally](https://confluence.atlassian.com/bitbucket/set-up-git-744723531.html) on your computer to contribute.
5. Some excellent guides to quickly understand the basics of Git are [here](http://readwrite.com/2013/09/30/understanding-github-a-journey-for-beginners-part-1), [here](https://www.atlassian.com/git/tutorials/setting-up-a-repository) & [here](https://www.atlassian.com/git/tutorials/comparing-workflows/centralized-workflow).
6. Now you are finally ready to submit pull requests and make some contributions!
7. Head over to the [content repo](github.com/utdallascso/content)
8. You will need to __clone__ this repo by selecting either the Https address or the SSH (depending on your Git setup) ![Where to find this 'clone' address?](/images/content/gitclone.png)
9. Start making some awesome [contributions](https://www.atlassian.com/git/tutorials/making-a-pull-request/)! :v:

Note: Information about using the markdown format can be found [here](https://blog.ghost.org/markdown/)

### Organization of the repo
---
* __Topics__: All topics have their individual folders. Each folder must cover all sorts of CSO camps and activities. The recommended structure is something on the lines of: 
```
  JAVA
    |__ Beginner 
    |       |_Content that will span a week (Mainly meant for summer camps)  
    |       |_Weekend/after school coding camps
    | 
    |__ Advanced
            |__Similar content
```

* __Images__: All images used in one particular markdown file will be stored in the `images` folder with the folder name corresponding to title of the file. _('content' in this case)_ The mouseover text should be helpful and meaningful.

* __Code__: All code must similarly go in the `codes` folder with similar restrictions. This is important for topics like Java, Javascript and C++. As programs get bigger, the Readme.md files get unwieldy. This setup will ensure that when questions need to be changed, code de-bugged or any major change made, the change will have to be only made in the code folder. Just basic OOPs principles in practice :wink: 