<template><h2 id="_343-整数拆分"><a class="header-anchor" href="#_343-整数拆分">#</a> 343.整数拆分</h2>
<p>给定一个正整数 <em>n</em>，将其拆分为<strong>至少</strong>两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。</p>
<p>官方给的例子：</p>
<div class="language-txt ext-txt line-numbers-mode"><pre v-pre class="language-txt"><code>输入: 2
输出: 1
解释: 2 = 1 + 1, 1 × 1 = 1。
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br></div></div><div class="language-txt ext-txt line-numbers-mode"><pre v-pre class="language-txt"><code>输入: 10
输出: 36
解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br></div></div><h3 id="思路"><a class="header-anchor" href="#思路">#</a> 思路</h3>
<p>1.根据官方的提示，可以观察7-10的规律。</p>
<div class="language-txt ext-txt line-numbers-mode"><pre v-pre class="language-txt"><code>输入：7
可以拆分成 4+3=7 4*3=12 ; 3+3+1=7 3*3*1=9 ; 2+2+2+1=7 2*2*2*1=8 ;2+2+3=7 2*2*3=12
最高组合为; 4+3 2+2+3  12 
输入; 8
拆分:4+4 , 16 ; 5+3 ,15 ; 2+2+2+2+2 ,16 ; 3+2+2+1 12 ; 3+3+2 18
最高为 3+3+2 
9 ： 3+3+3 , 27 ; 6+3 18; 
10: 3+3+4,36 ,3+3+2+2 36;
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br></div></div><p>发现，最大值组成为<code>3</code>，<code>2</code>的组合。因此把整数拆分成最多<code>3</code>，和<code>2</code>的组合,同时需要避免出现<code>1</code></p>
<p>2.证明，<code>3</code>和<code>2</code>组合为最大的乘积。</p>
<p>设整数N可以拆分成 ：
$$
a_1+a_2 +a_3+...+a_n
$$
那么最大值为：
$$
\max(a_1*a_2 * a_3 * ... * a_n)
$$</p>
<p>由均值不等式。
$$
\frac {a_1+a_2 +a_3+...+a_n} {n}   \geqslant \sqrt[n]{a_1a_2a_3...a_n}
$$</p>
</template>