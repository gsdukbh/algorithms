<template><h2 id="_3的幂"><a class="header-anchor" href="#_3的幂">#</a> 3的幂</h2>
<h5 id="思路-迭代。"><a class="header-anchor" href="#思路-迭代。">#</a> 思路：迭代。</h5>
<div class="language-java ext-java line-numbers-mode"><pre v-pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">boolean</span> <span class="token function">isPowerOfThree</span><span class="token punctuation">(</span><span class="token keyword">int</span> n<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token keyword">if</span> <span class="token punctuation">(</span>n <span class="token operator">&lt;</span> <span class="token number">1</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
            <span class="token keyword">return</span> <span class="token boolean">false</span><span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
        <span class="token keyword">while</span> <span class="token punctuation">(</span>n <span class="token operator">%</span> <span class="token number">3</span> <span class="token operator">==</span> <span class="token number">0</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
            n <span class="token operator">/=</span> <span class="token number">3</span><span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
        <span class="token keyword">return</span> n <span class="token operator">==</span> <span class="token number">1</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br></div></div><h5 id="思路-换底公式"><a class="header-anchor" href="#思路-换底公式">#</a> 思路：换底公式</h5>
<p>参考：<a href="https://zh.wikipedia.org/wiki/%E5%AF%B9%E6%95%B0%E6%81%92%E7%AD%89%E5%BC%8F" target="_blank" rel="noopener noreferrer">维基对数恒等式<OutboundLink/></a></p>
<div class="language-java ext-java line-numbers-mode"><pre v-pre class="language-java"><code>  <span class="token keyword">public</span> <span class="token keyword">boolean</span> <span class="token function">isPowerOfThree</span><span class="token punctuation">(</span><span class="token keyword">int</span> n<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token keyword">return</span> <span class="token punctuation">(</span><span class="token class-name">Math</span><span class="token punctuation">.</span><span class="token function">log10</span><span class="token punctuation">(</span>n<span class="token punctuation">)</span> <span class="token operator">/</span> <span class="token class-name">Math</span><span class="token punctuation">.</span><span class="token function">log10</span><span class="token punctuation">(</span><span class="token number">3</span><span class="token punctuation">)</span><span class="token punctuation">)</span> <span class="token operator">%</span> <span class="token number">1</span> <span class="token operator">==</span> <span class="token number">0</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br></div></div><p>公式：
$$
\frac {\log_{10}n} {\log_{10}3}=\log_3n
$$</p>
</template>