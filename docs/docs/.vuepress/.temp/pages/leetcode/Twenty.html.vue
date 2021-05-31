<template><h1 id="python3"><a class="header-anchor" href="#python3">#</a> Python3</h1>
<hr>
<div class="language-python ext-py line-numbers-mode"><pre v-pre class="language-python"><code>stack <span class="token operator">=</span> <span class="token punctuation">[</span><span class="token punctuation">]</span>
        judge <span class="token operator">=</span> <span class="token punctuation">{</span><span class="token string">'()'</span><span class="token punctuation">,</span><span class="token string">'[]'</span><span class="token punctuation">,</span><span class="token string">'{}'</span><span class="token punctuation">}</span>
        <span class="token keyword">for</span> i <span class="token keyword">in</span> s<span class="token punctuation">:</span>
            <span class="token keyword">if</span> <span class="token keyword">not</span> stack<span class="token punctuation">:</span> 
                stack<span class="token punctuation">.</span>append<span class="token punctuation">(</span>i<span class="token punctuation">)</span>
            <span class="token keyword">else</span><span class="token punctuation">:</span>
                <span class="token keyword">if</span> stack<span class="token punctuation">[</span><span class="token operator">-</span><span class="token number">1</span><span class="token punctuation">]</span><span class="token operator">+</span>i <span class="token keyword">in</span> judge<span class="token punctuation">:</span>
                    stack<span class="token punctuation">.</span>pop<span class="token punctuation">(</span><span class="token punctuation">)</span>
                <span class="token keyword">else</span><span class="token punctuation">:</span>
                    stack<span class="token punctuation">.</span>append<span class="token punctuation">(</span>i<span class="token punctuation">)</span>
                    
        <span class="token keyword">return</span> stack <span class="token operator">==</span> <span class="token punctuation">[</span><span class="token punctuation">]</span>

</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br><span class="line-number">10</span><br><span class="line-number">11</span><br><span class="line-number">12</span><br><span class="line-number">13</span><br></div></div></template>