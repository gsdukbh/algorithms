<template><h2 id="打乱数组"><a class="header-anchor" href="#打乱数组">#</a> 打乱数组</h2>
<p>打乱一个没有重复的数组。</p>
<div class="language-java ext-java line-numbers-mode"><pre v-pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">UpsetArray</span> <span class="token punctuation">{</span>
    <span class="token keyword">private</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> array<span class="token punctuation">;</span>
    <span class="token keyword">private</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> tem<span class="token punctuation">;</span>

    <span class="token keyword">public</span> <span class="token class-name">UpsetArray</span><span class="token punctuation">(</span><span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> nums<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token keyword">this</span><span class="token punctuation">.</span>array <span class="token operator">=</span> nums<span class="token punctuation">;</span>
        <span class="token keyword">this</span><span class="token punctuation">.</span>tem <span class="token operator">=</span> nums<span class="token punctuation">.</span><span class="token function">clone</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>

    <span class="token doc-comment comment">/**
     * Resets the array to its original configuration and return it.
     * 把数组还原.
     */</span>
    <span class="token keyword">public</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> <span class="token function">reset</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
        array <span class="token operator">=</span> tem<span class="token punctuation">;</span>
        tem <span class="token operator">=</span> tem<span class="token punctuation">.</span><span class="token function">clone</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token keyword">return</span> array<span class="token punctuation">;</span>
    <span class="token punctuation">}</span>

    <span class="token doc-comment comment">/**
     * Returns a random shuffling of the array.
     */</span>
    <span class="token keyword">public</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> <span class="token function">shuffle</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> i <span class="token operator">&lt;</span> array<span class="token punctuation">.</span>length<span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
            <span class="token function">swap</span><span class="token punctuation">(</span>i<span class="token punctuation">,</span><span class="token function">random</span><span class="token punctuation">(</span>i<span class="token punctuation">,</span>array<span class="token punctuation">.</span>length<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
        <span class="token keyword">return</span> array<span class="token punctuation">;</span>
    <span class="token punctuation">}</span>

    <span class="token keyword">private</span> <span class="token keyword">void</span> <span class="token function">swap</span><span class="token punctuation">(</span><span class="token keyword">int</span> a<span class="token punctuation">,</span> <span class="token keyword">int</span> b<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token keyword">int</span> tem <span class="token operator">=</span> array<span class="token punctuation">[</span>a<span class="token punctuation">]</span><span class="token punctuation">;</span>
        array<span class="token punctuation">[</span>a<span class="token punctuation">]</span> <span class="token operator">=</span> array<span class="token punctuation">[</span>b<span class="token punctuation">]</span><span class="token punctuation">;</span>
        array<span class="token punctuation">[</span>b<span class="token punctuation">]</span> <span class="token operator">=</span> tem<span class="token punctuation">;</span>
    <span class="token punctuation">}</span>

    <span class="token keyword">private</span> <span class="token keyword">int</span> <span class="token function">random</span><span class="token punctuation">(</span><span class="token keyword">int</span> start<span class="token punctuation">,</span> <span class="token keyword">int</span> end<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token class-name">Random</span> random <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Random</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token keyword">return</span> random<span class="token punctuation">.</span><span class="token function">nextInt</span><span class="token punctuation">(</span>end <span class="token operator">-</span> start<span class="token punctuation">)</span> <span class="token operator">+</span> start<span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br><span class="line-number">10</span><br><span class="line-number">11</span><br><span class="line-number">12</span><br><span class="line-number">13</span><br><span class="line-number">14</span><br><span class="line-number">15</span><br><span class="line-number">16</span><br><span class="line-number">17</span><br><span class="line-number">18</span><br><span class="line-number">19</span><br><span class="line-number">20</span><br><span class="line-number">21</span><br><span class="line-number">22</span><br><span class="line-number">23</span><br><span class="line-number">24</span><br><span class="line-number">25</span><br><span class="line-number">26</span><br><span class="line-number">27</span><br><span class="line-number">28</span><br><span class="line-number">29</span><br><span class="line-number">30</span><br><span class="line-number">31</span><br><span class="line-number">32</span><br><span class="line-number">33</span><br><span class="line-number">34</span><br><span class="line-number">35</span><br><span class="line-number">36</span><br><span class="line-number">37</span><br><span class="line-number">38</span><br><span class="line-number">39</span><br><span class="line-number">40</span><br></div></div></template>