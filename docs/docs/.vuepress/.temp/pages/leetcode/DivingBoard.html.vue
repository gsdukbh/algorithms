<template><h2 id="跳水板"><a class="header-anchor" href="#跳水板">#</a> 跳水板</h2>
<p>思路，</p>
<p>我们可以观察题目，运用初中的知识得出长度的函数，</p>
<p>$$
Z=(K-X)<em>Shore+X</em>longer
$$</p>
<p>这里 Z 是拼接出长度的值，k为木板数量，x为使用长度为longer的数量。</p>
<p>代码：</p>
<div class="language-java ext-java line-numbers-mode"><pre v-pre class="language-java"><code><span class="token keyword">class</span> <span class="token class-name">Solution</span> <span class="token punctuation">{</span>
    <span class="token keyword">public</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> <span class="token function">divingBoard</span><span class="token punctuation">(</span><span class="token keyword">int</span> shorter<span class="token punctuation">,</span> <span class="token keyword">int</span> longer<span class="token punctuation">,</span> <span class="token keyword">int</span> k<span class="token punctuation">)</span> <span class="token punctuation">{</span>
       
        <span class="token keyword">if</span> <span class="token punctuation">(</span>k <span class="token operator">==</span> <span class="token number">0</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
            <span class="token keyword">return</span> <span class="token keyword">new</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token number">0</span><span class="token punctuation">]</span><span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
        <span class="token keyword">if</span> <span class="token punctuation">(</span>shorter <span class="token operator">==</span> longer<span class="token punctuation">)</span> <span class="token punctuation">{</span>
            <span class="token keyword">return</span> <span class="token keyword">new</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span><span class="token punctuation">{</span>shorter <span class="token operator">*</span> k<span class="token punctuation">}</span><span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
        <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> lengths <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token keyword">int</span><span class="token punctuation">[</span>k <span class="token operator">+</span> <span class="token number">1</span><span class="token punctuation">]</span><span class="token punctuation">;</span>
        <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> i <span class="token operator">&lt;=</span> k<span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
            lengths<span class="token punctuation">[</span>i<span class="token punctuation">]</span> <span class="token operator">=</span> shorter <span class="token operator">*</span> <span class="token punctuation">(</span>k <span class="token operator">-</span> i<span class="token punctuation">)</span> <span class="token operator">+</span> longer <span class="token operator">*</span> i<span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
        <span class="token keyword">return</span> lengths<span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br><span class="line-number">10</span><br><span class="line-number">11</span><br><span class="line-number">12</span><br><span class="line-number">13</span><br><span class="line-number">14</span><br><span class="line-number">15</span><br><span class="line-number">16</span><br></div></div></template>