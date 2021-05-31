<template><h1 id="构建二叉树"><a class="header-anchor" href="#构建二叉树">#</a> 构建二叉树</h1>
<h2 id="题目描述"><a class="header-anchor" href="#题目描述">#</a> 题目描述：</h2>
<div class="language-text ext-text line-numbers-mode"><pre v-pre class="language-text"><code>输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入
前序遍历序列{1,2,4,7,3,5,6,8}
和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br></div></div><ul>
<li>解题思路</li>
</ul>
<div class="language-text ext-text line-numbers-mode"><pre v-pre class="language-text"><code>1.前序第一个为root 1
2.在中序找到 1 index 为 3
3.在中序的 index[3] 前面是左子树，右边是右子树
4.切割子树序列
5.递归以上步骤
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br></div></div><ul>
<li><a href="../../../leetcode/app/src/main/java/top/werls/leetcode/reConstructBinaryTree.java">代码</a></li>
</ul>
<div class="language-java ext-java line-numbers-mode"><pre v-pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> reConstructBinaryTree <span class="token punctuation">{</span>
    <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">class</span> <span class="token class-name">TreeNode</span> <span class="token punctuation">{</span>
        <span class="token keyword">int</span> val<span class="token punctuation">;</span>
        <span class="token class-name">TreeNode</span> left<span class="token punctuation">;</span>
        <span class="token class-name">TreeNode</span> right<span class="token punctuation">;</span>

        <span class="token class-name">TreeNode</span><span class="token punctuation">(</span><span class="token keyword">int</span> x<span class="token punctuation">)</span> <span class="token punctuation">{</span>
            <span class="token keyword">this</span><span class="token punctuation">.</span>val <span class="token operator">=</span> x<span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
    <span class="token punctuation">}</span>
    <span class="token doc-comment comment">/**
     * 1.前序第一个为root 1
     * 2.在中序找到 1 index 为 3
     * 3.在中序的 index[3] 前面是左子树，右边是右子树
     * 4.切割子树序列
     * 5.递归以上步骤
     * <span class="token keyword">@param</span> <span class="token parameter">pre</span> <span class="token punctuation">{</span>1,2,4,7,3,5,6,8<span class="token punctuation">}</span> = pre
     * <span class="token keyword">@param</span> <span class="token parameter">in</span> <span class="token punctuation">{</span>4,7,2,1,5,3,8,6<span class="token punctuation">}</span> = in
     * <span class="token keyword">@return</span> root
     */</span>
    <span class="token keyword">public</span> <span class="token class-name">TreeNode</span> <span class="token function">reConstructBinaryTree1</span><span class="token punctuation">(</span><span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> pre<span class="token punctuation">,</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> in<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token keyword">if</span> <span class="token punctuation">(</span>pre<span class="token punctuation">.</span>length <span class="token operator">==</span> <span class="token number">0</span> <span class="token operator">||</span> in<span class="token punctuation">.</span>length <span class="token operator">==</span> <span class="token number">0</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
            <span class="token keyword">return</span>  <span class="token keyword">null</span><span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
        <span class="token class-name">TreeNode</span> root<span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">TreeNode</span><span class="token punctuation">(</span>pre<span class="token punctuation">[</span><span class="token number">0</span><span class="token punctuation">]</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> i <span class="token operator">&lt;</span> in<span class="token punctuation">.</span>length<span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
            <span class="token keyword">if</span> <span class="token punctuation">(</span>in<span class="token punctuation">[</span>i<span class="token punctuation">]</span> <span class="token operator">==</span> pre<span class="token punctuation">[</span><span class="token number">0</span><span class="token punctuation">]</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
                root<span class="token punctuation">.</span>left <span class="token operator">=</span> <span class="token function">reConstructBinaryTree1</span><span class="token punctuation">(</span><span class="token class-name">Arrays</span><span class="token punctuation">.</span><span class="token function">copyOfRange</span><span class="token punctuation">(</span>pre<span class="token punctuation">,</span> <span class="token number">1</span><span class="token punctuation">,</span> i <span class="token operator">+</span> <span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">,</span> <span class="token class-name">Arrays</span><span class="token punctuation">.</span><span class="token function">copyOfRange</span><span class="token punctuation">(</span>in<span class="token punctuation">,</span> <span class="token number">0</span><span class="token punctuation">,</span> i<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
                root<span class="token punctuation">.</span>right <span class="token operator">=</span> <span class="token function">reConstructBinaryTree1</span><span class="token punctuation">(</span><span class="token class-name">Arrays</span><span class="token punctuation">.</span><span class="token function">copyOfRange</span><span class="token punctuation">(</span>pre<span class="token punctuation">,</span> i <span class="token operator">+</span> <span class="token number">1</span><span class="token punctuation">,</span> pre<span class="token punctuation">.</span>length<span class="token punctuation">)</span><span class="token punctuation">,</span> <span class="token class-name">Arrays</span><span class="token punctuation">.</span><span class="token function">copyOfRange</span><span class="token punctuation">(</span>in<span class="token punctuation">,</span> i <span class="token operator">+</span> i<span class="token punctuation">,</span> in<span class="token punctuation">.</span>length<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
                <span class="token keyword">break</span><span class="token punctuation">;</span>
            <span class="token punctuation">}</span>
        <span class="token punctuation">}</span>
        <span class="token keyword">return</span> root<span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br><span class="line-number">10</span><br><span class="line-number">11</span><br><span class="line-number">12</span><br><span class="line-number">13</span><br><span class="line-number">14</span><br><span class="line-number">15</span><br><span class="line-number">16</span><br><span class="line-number">17</span><br><span class="line-number">18</span><br><span class="line-number">19</span><br><span class="line-number">20</span><br><span class="line-number">21</span><br><span class="line-number">22</span><br><span class="line-number">23</span><br><span class="line-number">24</span><br><span class="line-number">25</span><br><span class="line-number">26</span><br><span class="line-number">27</span><br><span class="line-number">28</span><br><span class="line-number">29</span><br><span class="line-number">30</span><br><span class="line-number">31</span><br><span class="line-number">32</span><br><span class="line-number">33</span><br><span class="line-number">34</span><br><span class="line-number">35</span><br></div></div></template>