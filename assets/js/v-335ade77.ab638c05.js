(self.webpackChunkdocs=self.webpackChunkdocs||[]).push([[2348],{1798:(n,s,a)=>{"use strict";a.r(s),a.d(s,{data:()=>p});const p={key:"v-335ade77",path:"/leetcode/AddStrings.html",title:"",lang:"zh-CN",frontmatter:{},excerpt:"",headers:[{level:2,title:"字符串相加",slug:"字符串相加",children:[]}],filePathRelative:"leetcode/AddStrings.md",git:{updatedTime:1622450691e3,contributors:[]}}},5059:(n,s,a)=>{"use strict";a.r(s),a.d(s,{default:()=>t});const p=(0,a(6252).uE)('<h2 id="字符串相加"><a class="header-anchor" href="#字符串相加">#</a> 字符串相加</h2><p>给定两个字符串形式的非负整数 <code>num1</code> 和<code>num2</code> ，计算它们的和。</p><h4 id="思路"><a class="header-anchor" href="#思路">#</a> 思路：</h4><p>可以从低位的数字进行加法运算。并使用竖式运算的进位方式。</p><p><a href="AddString.java">代码</a></p><div class="language-java ext-java line-numbers-mode"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token class-name">String</span> <span class="token function">addStrings</span><span class="token punctuation">(</span><span class="token class-name">String</span> num1<span class="token punctuation">,</span> <span class="token class-name">String</span> num2<span class="token punctuation">)</span> <span class="token punctuation">{</span>\n        <span class="token class-name">StringBuffer</span> stringBuffer <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">StringBuffer</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>\n        <span class="token keyword">int</span> n <span class="token operator">=</span> num1<span class="token punctuation">.</span><span class="token function">length</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token operator">-</span> <span class="token number">1</span><span class="token punctuation">,</span> m <span class="token operator">=</span> num2<span class="token punctuation">.</span><span class="token function">length</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token operator">-</span> <span class="token number">1</span><span class="token punctuation">,</span> carry <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>\n        <span class="token keyword">while</span> <span class="token punctuation">(</span>carry <span class="token operator">!=</span> <span class="token number">0</span> <span class="token operator">||</span> n <span class="token operator">&gt;=</span> <span class="token number">0</span> <span class="token operator">||</span> m <span class="token operator">&gt;=</span> <span class="token number">0</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>\n            <span class="token keyword">if</span> <span class="token punctuation">(</span>n <span class="token operator">&gt;=</span> <span class="token number">0</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>\n                <span class="token comment">// 复位</span>\n                carry <span class="token operator">+=</span> num1<span class="token punctuation">.</span><span class="token function">charAt</span><span class="token punctuation">(</span>n<span class="token operator">--</span><span class="token punctuation">)</span> <span class="token operator">-</span> <span class="token char">&#39;0&#39;</span><span class="token punctuation">;</span>\n            <span class="token punctuation">}</span>\n            <span class="token keyword">if</span> <span class="token punctuation">(</span>m <span class="token operator">&gt;=</span> <span class="token number">0</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>\n                carry <span class="token operator">+=</span> num2<span class="token punctuation">.</span><span class="token function">charAt</span><span class="token punctuation">(</span>m<span class="token operator">--</span><span class="token punctuation">)</span> <span class="token operator">-</span> <span class="token char">&#39;0&#39;</span><span class="token punctuation">;</span>\n            <span class="token punctuation">}</span>\n            stringBuffer<span class="token punctuation">.</span><span class="token function">append</span><span class="token punctuation">(</span>carry <span class="token operator">%</span> <span class="token number">10</span><span class="token punctuation">)</span><span class="token punctuation">;</span>\n            carry <span class="token operator">/=</span> <span class="token number">10</span><span class="token punctuation">;</span>\n        <span class="token punctuation">}</span>\n    \t\n        <span class="token keyword">return</span> stringBuffer<span class="token punctuation">.</span><span class="token function">reverse</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">toString</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>\n    <span class="token punctuation">}</span>\n</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br><span class="line-number">10</span><br><span class="line-number">11</span><br><span class="line-number">12</span><br><span class="line-number">13</span><br><span class="line-number">14</span><br><span class="line-number">15</span><br><span class="line-number">16</span><br><span class="line-number">17</span><br></div></div>',6),t={render:function(n,s){return p}}}}]);