# Christmas Jogging
This code is part of the "Tech Challenge Series – Advent Calendar 2021" advanced by Blip.pt (developed by Devskiller).

*This year counting down to Christmas will be even funnier and Blip will be by your side the whole time with a variety of small programming puzzles and lots of prizes!*

## Task description
Holidays are here and that means tons of sweets, cakes and delicious meals ahead. However, Bill is really being consistent and self-disciplined with his last new year resolution, getting fit! And of course, he does not want to ruin his achievements in the last weeks of the year, the most difficult ones indeed.  

So Bill sets a plan to, at least, maintain his weight during the holidays, but at the same time, he wants to be more flexible in his diet, so he can still enjoy his favorite dessert, Bolo Rei, during family gatherings. To do so, he has to commit to some extra exercise sessions, the Bolo Rei Jogging!  

Each slice of Bolo Rei has a calorie count c, and Bill has to run a distance to expend those calories. After eating n slices of Bolo Rei, he must run **2n * c** for each slice.  

Find what is the minimum amout of distance that Bill has to run in order to stay fit.  

**Function signature**
getMinimumDistance(int[] calories) returns int  

**Examples:**
calories= {5, 10, 7}  
Result: 44  

If Bill eats the slices in the order that is shown, he will need to walk:  
(20 * 5) + (21 * 10) + (22 * 7) = 53  
This is not the minimum, so in order to minimize the running distance, it is possible to eat the slices in different order.  
(20 * 10) + (21 * 7) + (22 * 5) = 44  
  
**Constraints**
- N is between 1 and 40  
- C is between 1 and 1000  
