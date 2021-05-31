<template><h2 id="最长公共前缀"><a class="header-anchor" href="#最长公共前缀">#</a> 最长公共前缀</h2>
<p>编写一个函数来查找字符串数组中的最长公共前缀。</p>
<p>如果不存在公共前缀，返回空字符串 &quot;&quot;</p>
<h2 id="java-实现"><a class="header-anchor" href="#java-实现">#</a> Java 实现</h2>
<p><a href="../../../leetcode/app/src/main/java/top/werls/leetcode/Fourteen.java">程序</a></p>
<div class="language-java ext-java line-numbers-mode"><pre v-pre class="language-java"><code>
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">Fourteen</span> <span class="token punctuation">{</span>
    <span class="token doc-comment comment">/**
     *最长公共前缀
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""
     */</span>
    <span class="token keyword">public</span> <span class="token class-name">String</span> <span class="token function">longestCommonPrefix</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> strs<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token keyword">if</span> <span class="token punctuation">(</span>strs<span class="token punctuation">.</span>length <span class="token operator">==</span> <span class="token number">0</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
            <span class="token keyword">return</span> <span class="token string">""</span><span class="token punctuation">;</span><span class="token punctuation">}</span>
        <span class="token class-name">String</span> p <span class="token operator">=</span> strs<span class="token punctuation">[</span><span class="token number">0</span><span class="token punctuation">]</span><span class="token punctuation">;</span>
        <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">1</span><span class="token punctuation">;</span> i <span class="token operator">&lt;</span> strs<span class="token punctuation">.</span>length<span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
            <span class="token keyword">while</span> <span class="token punctuation">(</span>strs<span class="token punctuation">[</span>i<span class="token punctuation">]</span><span class="token punctuation">.</span><span class="token function">indexOf</span><span class="token punctuation">(</span>p<span class="token punctuation">)</span> <span class="token operator">!=</span> <span class="token number">0</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
                <span class="token comment">//匹配是否有公共头部</span>
                p <span class="token operator">=</span> p<span class="token punctuation">.</span><span class="token function">substring</span><span class="token punctuation">(</span><span class="token number">0</span><span class="token punctuation">,</span> p<span class="token punctuation">.</span><span class="token function">length</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token operator">-</span> <span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
                <span class="token keyword">if</span> <span class="token punctuation">(</span>p<span class="token punctuation">.</span><span class="token function">isEmpty</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span> <span class="token punctuation">{</span><span class="token keyword">return</span> <span class="token string">""</span><span class="token punctuation">;</span><span class="token punctuation">}</span>
            <span class="token punctuation">}</span>
        <span class="token punctuation">}</span>
        <span class="token keyword">return</span> p<span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br><span class="line-number">10</span><br><span class="line-number">11</span><br><span class="line-number">12</span><br><span class="line-number">13</span><br><span class="line-number">14</span><br><span class="line-number">15</span><br><span class="line-number">16</span><br><span class="line-number">17</span><br><span class="line-number">18</span><br><span class="line-number">19</span><br><span class="line-number">20</span><br><span class="line-number">21</span><br></div></div><h2 id="python-实现"><a class="header-anchor" href="#python-实现">#</a> Python 实现</h2>
<div class="language-python ext-py line-numbers-mode"><pre v-pre class="language-python"><code><span class="token keyword">def</span> <span class="token function">longestCommonPrefix</span><span class="token punctuation">(</span>self<span class="token punctuation">,</span> strs<span class="token punctuation">)</span><span class="token punctuation">:</span>
        <span class="token triple-quoted-string string">"""
        :type strs: List[str]
        :rtype: str
        """</span>
        <span class="token keyword">if</span> <span class="token keyword">not</span> strs<span class="token punctuation">:</span> <span class="token keyword">return</span> <span class="token string">""</span>
        s1 <span class="token operator">=</span> <span class="token builtin">min</span><span class="token punctuation">(</span>strs<span class="token punctuation">)</span>
        s2 <span class="token operator">=</span> <span class="token builtin">max</span><span class="token punctuation">(</span>strs<span class="token punctuation">)</span>
        <span class="token keyword">for</span> i<span class="token punctuation">,</span>x <span class="token keyword">in</span> <span class="token builtin">enumerate</span><span class="token punctuation">(</span>s1<span class="token punctuation">)</span><span class="token punctuation">:</span>
            <span class="token keyword">if</span> x <span class="token operator">!=</span> s2<span class="token punctuation">[</span>i<span class="token punctuation">]</span><span class="token punctuation">:</span>
                <span class="token keyword">return</span> s2<span class="token punctuation">[</span><span class="token punctuation">:</span>i<span class="token punctuation">]</span>
        <span class="token keyword">return</span> s1
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br><span class="line-number">10</span><br><span class="line-number">11</span><br><span class="line-number">12</span><br></div></div></template>